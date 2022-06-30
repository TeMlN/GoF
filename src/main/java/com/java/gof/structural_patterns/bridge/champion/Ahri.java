package com.java.gof.structural_patterns.bridge.champion;

import com.java.gof.structural_patterns.bridge.DefaultChampion;
import com.java.gof.structural_patterns.bridge.Skin;

public class Ahri extends DefaultChampion {

    public Ahri(Skin skin) {
        super(skin, "아리");
    }
}
