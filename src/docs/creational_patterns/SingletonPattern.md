## Singleton 패턴

인스턴스를 오직 한개만 제공하는 클래스

* 시스템 Runtime, 환경 세팅에 대한 정보 등, 인스턴스가 여러개 일 때 문제가 생길 수 있는 경우가 있기때문에 이럴경우 Singleton 패턴을 이용하여 인스턴스를 한개만 제공하여야 한다. (환경 세팅의 경우 여러개의 인스턴스가 옵션이 서로 다르면 무결성에 문제가 있기 때문)

* 해당 Singleton 패턴을 접목시킨 인스턴스는 global하게 접근할 수 있어야 한다.


### 가장 쉽게 Singleton Pattern을 구현하는 방법
```java
public class Settings {

    //반환 시킬 인스턴스
    private static Settings instance;

    //생성자를 private으로 생성
    private Settings() {}

    public static Settings getInstance() {
        //만약 instance가 할당되지 않았다면 instance에 생성자를 통해 instance 생성
        if (instance == null) {
            instance = new Settings();
        }
        //만약 할당된 instance라면 그대로 반환
        return instance;
    }
}
```

```java
public class App {
    public static void main(String[] args) {
        Settings settings = Settings.getInstance();
        Settings settings1 = Settings.getInstance(); //첫번째 settings 인스턴스를 생성할때 Settings의 instance가 할당 되었기 때문에 같은 instance를 반환

        System.out.println(settings==settings1); //actual : true

    }
}
```

### Multi Thread 환경에서의 Singleton Pattern

하지만 이같은 방법에도 단점은 존재한다
그 점은 바로 평소 우리가 개발한 Web Application은 멀티 쓰레드를 사용하기 때문에 이방법은 멀티 쓰레드 환경에서 Thread-safe 하지 않는다는 점이다.
 
그렇다면 왜 Thread-safe 하지 않을까? 아까 사용했던 Settings Class를 가져와 설명해보겠다.

```java
public class Settings {

    private static Settings instance;

    private Settings() {}

    public static Settings getInstance() {
        //1번 Thread가 getInstance를 호출하여 검증문을 지나기도 전에
        //2번 Thread가 getInstance를 호출한다면?
        if (instance == null) {
            instance = new Settings();
        }
        // 서로 다른 두개의 instance가 반환됨
        return instance;
    }
}
```

그렇다면 멀티 쓰레드 환경에서도 Thread-safe하게 Singleton Pattern을 구현하는 방법은?
* synchronized : getInstance에 synchronized 키워드를 붙히면 동기처리가 되기 때문에 쓰레드가 하나 들어와있을 떄 다른 쓰레드가 접근하지 못함 그래서 성능 저하가 있음. 
* 이른 초기화(eager initialization) : instance 에 미리 생성을 하는 방법 `private static final Settings INSTANCE = new Settings();` 이런식으로 생성과 동시에 할당을 하고 getInstance 메서드에서 검증문 없이 그냥 `return instance;`해주는 방법.
    * 하지만 이방법은 만약에 instance를 사용하지 않아서 생성이 필요없을때에도 상관없이 항상 Application 로딩 시점에 생성되기 때문에 메모리가 낭비된다는 단점이 있음.
    
* double checked lock : 이 방법은 synchronized 키워드를 이용한 방법과 유사하지만 좀 더 효율적이다 

#### double checked lock
```java
public class Settings {

    // 이전 방식과는 다르게 volatile 키워드를 붙여야 JDK 1.5버전 위에서 정상 동작합니다.
    private static volatile Settings instance;

    private Settings() {}

    public static Settings getInstance() {
        //synchronized 키워드와 달라진 점은 바로 모든 쓰레드가 동기화된 검증문을 거치지 않는다는 것이다.
        if (instance == null) {
            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }
}
```

* static inner : static inner 클래스를 사용하여 생성하는 방법이다.
#### static inner
```java
public class Settings {
    
    private Settings() {}

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }
}

```

