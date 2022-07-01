package com.java.gof.structural_patterns.composite;

public class Item implements Component {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // @Override를 붙히면 해당 메소드를 구현하는 클래스의 메소드와 시그니쳐를 비교해서 서로 맞지 않는다면 컴파일 타임에 에러가 발생한다.
    @Override
    public int getPrice() {
        return 0;
    }
}
