package org.academiadecodigo.hexallents.gameEngine;

public class Game {
    private static GameState gameState;

    private Menu menu;
    private GridGame grid;
    private Player player;
    private int currentLevel = 1;

    public Game() {
        gameState = GameState.MENU;
    }

    public void init() {
        while (gameState != GameState.NONE) {
            switch (gameState) {
                case MENU:
                    menu = new Menu();
                    break;
                case INGAME:
                    grid = new GridGame();
                    player = new Player(grid);
                    grid.nextLevel(currentLevel);
                    grid.initGrid();
                    player.keyEvents();
                    checkVictory();
                    break;
            }
        }
    }

    public void checkVictory() {

        while (true) {

            if (grid.getSquares() == null) {
                continue;
            }
            if (grid.checkIfComplete()) {
                System.err.println("next level");
                currentLevel++;
                init();
            }
        }
    }

    public static void setGameState(GameState gameState) {
        Game.gameState = gameState;
    }
}

