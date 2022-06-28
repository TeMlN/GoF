package com.java.gof.creational_patterns.singleton;

import java.io.Serializable;

public class Settings implements Serializable {

//    private static Settings instance;

    private Settings() {}

//    public static Settings getInstance() {
//        if (instance == null) {
//            instance = new Settings();
//        }
//        return instance;
//    }

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    /**
     * Serializable과 Deserializable를 이용한 singleton pattern을 깨뜨리는 방법을 무효화 시키는 방법
     * Deserializable 할때 readResolve라는 signature를 사용하기 때문에 기존의 readResolve는 new 를 통해 인스턴스를 생성하지만
     * 그걸 조작함으로써 readResolve를 호출해도 getInstance 메소드를 호출하게 변경하면 무효화 시킬 수 있다.
     * @return
     */
    protected Object readResolve() {
        return getInstance();
    }
}
