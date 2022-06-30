package com.java.gof.structural_patterns.bridge;

import com.java.gof.structural_patterns.bridge.champion.Ahkalli;
import com.java.gof.structural_patterns.bridge.champion.Ahri;
import com.java.gof.structural_patterns.bridge.skin.KDA;
import com.java.gof.structural_patterns.bridge.skin.PoolParty;

public class Client {
    public static void main(String[] args) {
        Champion ahri = new Ahri(new KDA());
        Champion ahkalli = new Ahkalli(new PoolParty());

        ahri.skillQ();
        ahri.skillR(); 

        ahkalli.skillQ();
        ahkalli.skillW();
    }
}
