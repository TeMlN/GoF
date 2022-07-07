package com.java.gof.structural_patterns.proxy.implement;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
