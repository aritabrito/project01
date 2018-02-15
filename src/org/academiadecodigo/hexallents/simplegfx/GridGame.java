package org.academiadecodigo.hexallents.simplegfx;

import org.academiadecodigo.hexallents.Level;
import org.academiadecodigo.hexallents.rectangle.ImmutableSquare;
import org.academiadecodigo.hexallents.rectangle.MutableSquare;
import org.academiadecodigo.hexallents.rectangle.Square;
import org.academiadecodigo.simplegraphics.graphics.Color;

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

        for (int i = 0; i < currentLevel.length; i++) {

            for (int j = 0; j < currentLevel[i].length; j++) {

                squares = new Square[currentLevel.length][currentLevel[i].length];

                if (currentLevel[i][j] == 0) {
                    MutableSquare mSq = new MutableSquare(i, j, ColorMapper.getColor(ColorEnum.BLACK));
                    mSq.setSquare(j * CELL_SIZE + PADDING, i * CELL_SIZE + PADDING, CELL_SIZE, CELL_SIZE);
                    squares[i][j] = mSq;
                }
                for (int k = 1; k < ColorEnum.values().length; k++) {
                    if (currentLevel[i][j] == k) {
                        ImmutableSquare iSq = new ImmutableSquare(i, j, ColorMapper.getColor(ColorEnum.values()[k]));
                        iSq.setSquare(j * CELL_SIZE + PADDING, i * CELL_SIZE + PADDING, CELL_SIZE, CELL_SIZE);
                        squares[i][j] = iSq;
                    }
                }
            }
        }
    }

    public int getSquare(int x, int y) {
        int xS = conversionXY(x);
        int yS = conversionXY(y);
        System.out.println(xS + " " + yS);
        return currentLevel[xS][yS];
    }

    public int getColor(int x, int y) {
        int xS = conversionXY(x);
        int yS = conversionXY(y);
        if (currentLevel[xS][yS] != 0) {
            return currentLevel[xS][yS];
        }
        return -1;
    }

    public void setColor(int x, int y, int color) {
        int xS = conversionXY(x);
        int yS = conversionXY(y);
        if (currentLevel[xS][yS] == 0) {
            currentLevel[xS][yS] = color;
        }


    }

    public int conversionXY(int xOrY) {
        return xOrY / CELL_SIZE;
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
