package org.academiadecodigo.hexallents.grid;

import org.academiadecodigo.hexallents.simplegfx.SimpleGfxGrid;

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
    public static Grid makeGrid(int cols, int rows) { // podemos incluir o cellsize se for preciso
        return new SimpleGfxGrid(cols, rows);
    }
}
