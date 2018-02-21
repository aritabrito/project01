package org.academiadecodigo.hexallents.gameEngine;

import org.academiadecodigo.hexallents.Solution;

public class Game {

    private int level = 1;
    private Grid grid;
    private Player player;

    public Game() {
        grid = new Grid(SquareFactory.getSquaresPerLevel(level));
        player = new Player(grid);
        player.keyEvents();
    }

    public void start() {
        while (true) {
            proceed();
        }
    }

    public void proceed() {
        if (Solution.LEVEL1.isLevelCleared(grid.getSquares())) {
            grid = new Grid(SquareFactory.getSquaresPerLevel(++level));
            player.setGrid(grid);
        }
    }

}
