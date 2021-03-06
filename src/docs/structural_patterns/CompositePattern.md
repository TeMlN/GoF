## Composite 패턴
그룹 전체와 개별 객체를 동일하게 처리할 수 있는 패턴

클라이언트 입장에서는 '전체나 '부분'이나 모두 동일한 컴포넌트로 인식할 수 있는 계층 구조를 만든다. (Par t-Whole Hierarchy)

* 장점
    * 복잡한 트리 구조를 편리하게 사용할 수 있다.
    * 다형성과 재귀를 활용할 수 있다.
    * 클라이언트 코드를 변경하지 않고 새로운 엘리먼트 타입을 추가할 수 있다.
    
* 단점
    * 트리를 만들어야 하기 때문에 지나친 일반화를 하는 경우가 생길 수 있다.
      (너무 composite 패턴에 얽매이지 않고 유연하게 생각해보며 억지의 디자인 패턴 종속적인 개발은 피해라.)