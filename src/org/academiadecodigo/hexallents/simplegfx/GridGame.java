package org.academiadecodigo.hexallents.simplegfx;

import org.academiadecodigo.hexallents.Level;
import org.academiadecodigo.hexallents.grid.Grid;
import org.academiadecodigo.hexallents.rectangle.ImmutableSquare;
import org.academiadecodigo.hexallents.rectangle.MutableSquare;
import org.academiadecodigo.hexallents.rectangle.Square;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 10/02/2018.
 */
public class GridGame implements Grid {

    public static final int PADDING = 10;
    public final static int CELL_SIZE = 100;
    private int[][] currentLevel;
    private int cols;
    private int rows;
    private Level level;


    public GridGame() {
        level = new Level();
        currentLevel = level.level1();
        cols = currentLevel.length;
        rows = currentLevel.length;
    }

    @Override
    public void init() {

        for (int i = PADDING; i < cols; i += CELL_SIZE) {
            for (int j = PADDING; j < rows; j += CELL_SIZE) {
                if (currentLevel[i][j] == 0) {
                    new MutableSquare(i, j, ColorMapper.getColor(ColorEnum.BLACK));
                }
                for (int k = 1; k < ColorEnum.values().length; k++) {
                    if (currentLevel[i][j] == k) {
                        new ImmutableSquare(i, j, ColorMapper.getColor(ColorEnum.values()[k]));
                    }
                }
            }

        }
    }

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
    public GridGame makeGridPosition() {
        return null;
    }

    @Override
    public GridGame makeGridPosition(int col, int row, Color color) {
        return null;
    }

    public int rowToY(int row) {
        // converts row to pixels (y)
        return CELL_SIZE * row + PADDING;
    }

    /**
     * Auxiliary method to compute the x value that corresponds to a specific column
     *
     * @param column index
     * @return x pixel value
     */
    public int columnToX(int column) {
        // converts row to pixels (x)
        return CELL_SIZE * column + PADDING;
    }


}
