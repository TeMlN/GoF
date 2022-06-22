package com.java.gof.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Settings settings = new Settings();
//        Settings settings1 = new Settings();
//        System.out.println(settings!=settings1); // 서로 다른 instance이기 떄문에 true

//        Settings settings = Settings.getInstance();
//        Settings settings1 = Settings.getInstance();
//
//        System.out.println(settings!=settings1);

        Settings settings = Settings.getInstance();
        Settings settings1 = Settings.getInstance();

        /**
         * Reflection을 이용해 싱글톤 패턴을 깨뜨리는 방법
         */
        System.out.println("============ reflection start ============");

        Constructor<Settings> declaredConstructor = Settings.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true); //private method에도 접근할 수 있게 Accessible을 true로 설정
        Settings settings2 = declaredConstructor.newInstance();

        //둘의 hash code가 일치
        System.out.println(settings.hashCode());
        System.out.println(settings1.hashCode());

        System.out.println(settings2.hashCode());

        //actual : false
        System.out.println(settings == settings1);
        System.out.println("============ reflection finish ============");


        /**
         * Serializable, Deserialization을 이용한 singleton pattern을 깨뜨리는 방법
         */
        System.out.println("============ serializable start ===========");
        try (ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            objectOutput.writeObject(settings);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Settings settings3 = null;

        try (ObjectInput objectInput = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings3 = (Settings) objectInput.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //actual : false
        System.out.println(settings == settings3);
        System.out.println("============ serializable finish ===========");
    }

}
