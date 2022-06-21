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