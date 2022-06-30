package com.java.gof.structural_patterns.bridge;

public class DefaultChampion implements Champion {

    private Skin skin;

    private String name;

    public DefaultChampion(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(skin.getName() + this.name + " move");
    }

    @Override
    public void skillQ() {
        System.out.println(skin.getName() + this.name + " Q");
    }

    @Override
    public void skillW() {
        System.out.println(skin.getName() + this.name + " W");
    }

    @Override
    public void skillE() {
        System.out.println(skin.getName() + this.name + " E");
    }

    @Override
    public void skillR() {
        System.out.println(skin.getName() + this.name + " R");
    }
}
