package com.java.gof.structural_patterns.proxy.implement;

public class GameServiceProxy implements GameService {

    private GameService gameService;

    @Override
    public void startGame() throws InterruptedException {
        long before = System.currentTimeMillis();
        if (this.gameService == null) this.gameService = new DefaultGameService();
        gameService.startGame();
        Thread.sleep(1000L);
        System.out.println(System.currentTimeMillis() - before);
    }
}
