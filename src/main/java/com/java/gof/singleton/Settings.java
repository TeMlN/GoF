package com.java.gof.singleton;

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
}
