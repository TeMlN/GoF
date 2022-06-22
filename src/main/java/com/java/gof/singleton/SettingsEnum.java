package com.java.gof.singleton;

/**
 * enum의 단점은 클래스가 로딩될때 인스턴스들이 다 생성됨, 안쓰더라도
 * enum은 기본적으로 enum클래스를 상속받고 있고 enum은 자체적으로 serializable를 구현하고 있다.
 */
public enum SettingsEnum {
    INSTANCE
}
