## Abstract Factory 패턴

팩토리 메소드 패턴과 흡사하다.

<br>

##### 팩토리 메소드와의 공통점
* 모양과 효과가 비슷하다.
    * 둘 다 구체적인 객체 생성 과정을 추상화한 인터페이스를 제공한다.
    
##### 팩토리 메소드와의 다른점
* 관점이 다르다.
    * Factory Method Pattern은 "Factory를 구현하는 방법(inheritance)"에 초점을 둔다.
    * Abstract Factory Pattern은 "Factory를 사용하는 방법(composition)"에 초점을 둔다.
    
* 목적이 조금 다르다.
    * Factory Method Pattern은 구체적인 객체 생성 과정을 하위 또는 구체적인 클래스로 옮기는 것이 목적.
    * Abstract Factory Pattern은 관련있는 여러 객체를 구체적인 클래스에 의존하지 않고 만들 수 있게 해주는 것이 목적.

