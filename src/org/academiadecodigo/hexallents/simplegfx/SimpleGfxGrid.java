package org.academiadecodigo.hexallents.simplegfx;

import org.academiadecodigo.hexallents.grid.Grid;
import org.academiadecodigo.hexallents.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 10/02/2018.
 */
public class SimpleGfxGrid implements Grid {

    public static final int PADDING = 10;
    private int cols;
    private int rows;
    private Rectangle grid;
    public static int CELL_SIZE = 200;

    public SimpleGfxGrid(int cols, int rows){
        this.cols = cols;
        this.rows = rows;
    }

    /**
     * @see Grid#init()
     */
    @Override
    public void init() {
        grid = new Rectangle(PADDING, PADDING, CELL_SIZE*cols, CELL_SIZE*rows);
        grid.draw();

        for (int i = PADDING; i < getWidth(); i+= CELL_SIZE) {
            Rectangle rect;
            for (int j = PADDING; j < getHeight(); j+= CELL_SIZE) {
                rect = new Rectangle(i, j, CELL_SIZE, CELL_SIZE);
                rect.setColor(Color.RED);
                rect.draw();
            }
        }
    }

    /**
     * @see Grid#getCols()
     */
    @Override
    public int getCols() {
        return cols;
    }

    /**
     * @see Grid#getRows()
     */
    @Override
    public int getRows() {
        return rows;
    }

    @Override
    public GridPosition makeGridPosition() {
        return null;
    }

    /**
     * Obtains the width of the grid in pixels
     * @return the width of the grid
     */
    public int getWidth() {
        return grid.getWidth();
    }

    /**
     * Obtains the height of the grid in pixels
     * @return the height of the grid
     */
    public int getHeight() {
        return grid.getHeight();
    }

    /**
     * Obtains the grid X position in the SimpleGFX canvas
     * @return the x position of the grid
     */
    public int getX() {
        return grid.getX();
    }

    /**
     * Obtains the grid Y position in the SimpleGFX canvas
     * @return the y position of the grid
     */
    public int getY() {
        return grid.getY();
    }

    /**
     * Obtains the pixel width and height of a grid position
     * @return
     */
    public int getCellSize() {
        return CELL_SIZE;
    }


    /**
     * @see Grid#makeGridPosition(int, int)
     */
    @Override
    public GridPosition makeGridPosition(int col, int row) {
        return new SimpleGfxGridPosition(col, row, this);
    }

    /**
     * Auxiliary method to compute the y value that corresponds to a specific row
     * @param row index
     * @return y pixel value
     */
    public int rowToY(int row) {
        // converts row to pixels (y)
        return CELL_SIZE * row + PADDING;
    }

    /**
     * Auxiliary method to compute the x value that corresponds to a specific column
     * @param column index
     * @return x pixel value
     */
    public int columnToX(int column) {
        // converts row to pixels (x)
        return CELL_SIZE * column + PADDING;
    }
}
