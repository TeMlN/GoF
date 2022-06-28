package com.java.gof.creational_patterns.factory_method;

public interface DogFactory {
    default Dog bringDog(String name, String gender) {
        validate(name, gender);
        prepareFore(name);
        Dog dog = createDog();
        finish(name, gender);
        return dog;
    }

    Dog createDog();

    // interface에서 private 메소드를 사용하는건 java 9version 이상부터만 가능
    private void finish(String name, String gender) {
        System.out.println("귀여운 강아지 이름:" + name + " 성별:" + gender + " 의 분양준비를 끝냈습니다. ");
    }

    private void validate(String name, String gender) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("강아지 이름을 지어주세요");
        }
        if (gender == null || gender.isBlank()) {
            throw new IllegalArgumentException("강아지의 성별을 입력해주세요");
        }
    }

    private void prepareFore(String name) {
        System.out.println(name + "를 데려옵니다.");
    }
}
