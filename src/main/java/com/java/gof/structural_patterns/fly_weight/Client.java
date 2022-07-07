package com.java.gof.structural_patterns.fly_weight;

public class Client {
    public static void main(String[] args) {

        FontFactory factory = new FontFactory();

        Character h = new Character('h', "white", factory.getFont("nanum:12"));
        Character e = new Character('e', "white", factory.getFont("nanum:12"));
        Character l = new Character('l', "white", factory.getFont("nanum:12"));
        Character I = new Character('l', "white", factory.getFont("nanum:12"));
        Character o = new Character('o', "white", factory.getFont("nanum:12"));

        //getFont 를 여러번 호출한다해서 성능이 저하되지 않는다,
        //왜냐하면 같은 getFont에서의 cache Map을 같은 키의 cache Map을 계속해서 사용했기 때문이다.
    }
}
