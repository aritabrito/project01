package org.academiadecodigo.hexallents;

import org.academiadecodigo.hexallents.rectangle.Player;
import org.academiadecodigo.hexallents.simplegfx.GridGame;

/**
 * Created by codecadet on 10/02/2018.
 */
public class Game {

    private GridGame grid;
    private Player player;

    Game() {
        grid = new GridGame();
    }

    /**
     * Creates a bunch of cars and randomly puts them in the field
     */
    public void init() {

        grid.init();

        player = new Player(grid);
        grid = new GridGame();
        player.keyEvents();
    }

    /**
     * Starts the animation
     *
     * @throws InterruptedException
     */
    public void start() {

        while (true) {

            // Pause for a while
            /*Thread.sleep(delay);

            moveAllCars();*/

        }

    }
}
