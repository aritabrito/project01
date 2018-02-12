package org.academiadecodigo.hexallents;

import org.academiadecodigo.hexallents.grid.Grid;
import org.academiadecodigo.hexallents.grid.GridFactory;
import org.academiadecodigo.hexallents.rectangle.*;
import org.academiadecodigo.hexallents.rectangle.Player;
import org.academiadecodigo.hexallents.simplegfx.SimpleGfxGrid;

/**
 * Created by codecadet on 10/02/2018.
 */
public class Game {

    /*
     * Constructs a new game
     * @param gridType which grid type to use
     * @param cols number of columns in the grid
     * @param rows number of rows in the grid
     * @param delay animation delay
     */
    /*
    Game(GridType gridType, int cols, int rows, int delay) {

        grid = GridFactory.makeGrid(gridType, cols, rows);
        this.delay = delay;

        myCar = new RitasCar(grid.makeGridPosition());
    }
    */


    // chamamos um level

    // init()
    // se level 1 level.createLevel (2 cores, grelha 3x3) -> quando todas as células estão preenchidas muda de nível
    // se level 2 level.createLevel (3 core, grelha 6x6) instancia nova classe level



    private SimpleGfxGrid grid;

    private Square[][] squares;

    private CollisionDetector collisionDetector;
    private Player player;

    Game(int cols, int rows) {
        grid = GridFactory.makeGrid(cols, rows);

    }

    /**
     * Creates a bunch of cars and randomly puts them in the field
     */
    public void init() {

        grid.init();

        //myCar.keyEvents();

        //squares = SquareFactory.getRectangles(grid);

        //grid.makeGridPosition();
        squares = SquareFactory.getRectangles(grid);
        player = new Player(grid);

        player.keyEvents();


        /*
        cars = new Car[manufacturedCars];
        collisionDetector = new CollisionDetector(cars, myCar);

        for (int i = 0; i < manufacturedCars; i++) {

            cars[i] = CarFactory.getNewCar(grid);
            cars[i].setCollisionDetector(collisionDetector);
            cars[i].setGrid(grid);

        }*/

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
