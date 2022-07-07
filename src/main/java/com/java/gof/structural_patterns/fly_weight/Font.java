package com.java.gof.structural_patterns.fly_weight;

//FlyWeight 클래스는 불변클래스여야 한다.
public final class Font {
    final String family;
    final int size;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }

    public String getFamily() {
        return family;
    }

    public int getSize() {
        return size;
    }
}
