package org.academiadecodigo.hexallents.gameEngine;

public class Game {

    private GridGame grid;
    private Player player;
    private int currentLevel = 1;


    public void init() {
        grid = new GridGame();
        player = new Player(grid);
        grid.nextLevel(currentLevel);
        grid.initGrid();
        player.keyEvents();
    }


    public void checkVictory() {
        while (true) {
            if (grid.checkIfComplete()) {
                System.err.println("next level");
                currentLevel++;
                init();
            }
        }
    }
}

