package org.academiadecodigo.hexallents.simplegfx;

import org.academiadecodigo.hexallents.Level;
import org.academiadecodigo.hexallents.rectangle.ImmutableSquare;
import org.academiadecodigo.hexallents.rectangle.MutableSquare;
import org.academiadecodigo.hexallents.rectangle.Square;
import org.academiadecodigo.simplegraphics.graphics.Color;
import sun.text.resources.ro.CollationData_ro;

import java.util.Arrays;

/**
 * Created by codecadet on 10/02/2018.
 */
public class GridGame {

    public static final int PADDING = 10;
    public final static int CELL_SIZE = 100;
    private Square[][] squares;
    private int[][] currentLevel;
    private Level level;


    public GridGame() {
        level = new Level();
        currentLevel = level.level1();
    }

    public void init() {
        int gridSize = currentLevel.length;

        squares = new Square[gridSize][gridSize];
        for (int i = 0; i < currentLevel.length; i++) {

            for (int j = 0; j < currentLevel[i].length; j++) {



                if (currentLevel[i][j] == 0) {
                    System.out.println("CREATING IMMUTABLE SQAURE");
                    squares[i][j] = new MutableSquare(i, j, ColorMapper.getColor(ColorEnum.BLACK));
                    squares[i][j].setSquare(j * CELL_SIZE + PADDING, i * CELL_SIZE + PADDING,
                            CELL_SIZE, CELL_SIZE);
                }
                for (int k = 1; k < ColorEnum.values().length; k++) {
                    if (currentLevel[i][j] == k) {
                        squares[i][j] = new ImmutableSquare(i, j, ColorMapper.getColor(ColorEnum.values()[k]));
                        squares[i][j].setSquare(j * CELL_SIZE + PADDING, i * CELL_SIZE + PADDING,
                                CELL_SIZE, CELL_SIZE);
                    }
                }
            }
        }
    }


    public Square getSquare(int x, int y) {
        int xS = conversionXY(x);
        int yS = conversionXY(y);

        return squares[yS][xS];
    }

    public Color getColor(Square sqr) {
            return sqr.getColor();
    }

    public void setColor(double x, double y, Color color) {
        int xS = conversionXY((int)x);
        int yS = conversionXY((int)y);
        System.out.println(xS + " SETCOLOR" + yS);
        squares[yS][xS].setColor(color);
    }

    public int conversionXY(int xOrY) {
        return (xOrY + PADDING) / CELL_SIZE;
    }
   /* @Override
    public int getCols() {
        return cols;
    }

    /**
     * @see Grid#getRows()

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
        return CELL_SIZE * row + PADDING;
    }

    /**
     * Auxiliary method to compute the x value that corresponds to a specific column
     *
     * @param column index
     * @return x pixel value

    public int columnToX(int column) {
        return CELL_SIZE * column + PADDING;
    }
*/

}
