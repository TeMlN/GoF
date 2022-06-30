package com.java.gof.structural_patterns.bridge.champion;

import com.java.gof.structural_patterns.bridge.DefaultChampion;
import com.java.gof.structural_patterns.bridge.Skin;

public class Ahkalli extends DefaultChampion {
    public Ahkalli(Skin skin) {
        super(skin, "아칼리");
    }
}
