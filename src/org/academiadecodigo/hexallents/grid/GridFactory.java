package org.academiadecodigo.hexallents.grid;

import org.academiadecodigo.hexallents.simplegfx.GridGame;

/**
 * Created by codecadet on 10/02/2018.
 */
public class GridFactory {

    /**
     * Creates a new grid
     *
     * @param cols     the number of columns of the grid
     * @param rows     the number of rows of the grid
     * @return the new grid
     */
    public static GridGame makeGrid(int cols, int rows) { // podemos incluir o cellsize se for preciso
        return new GridGame(cols, rows);
    }
}
