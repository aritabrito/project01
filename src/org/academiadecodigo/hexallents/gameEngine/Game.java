package org.academiadecodigo.hexallents.gameEngine;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;

public class Game {
    private Menu menu;
    private GridGame grid;
    private Player player;
    private int currentLevel = 1;

    public Game() {
        menu = new Menu();
        player = new Player(grid, this, menu);
        grid = new GridGame();
    }


    public boolean menu(){
        menu.showImage();
        if(player.keyPressed(KeyboardEvent.);)
    }
    public void init() {

        grid.nextLevel(currentLevel);
        grid.initGrid();

        player.keyEvents();
        checkVictory();
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
}

