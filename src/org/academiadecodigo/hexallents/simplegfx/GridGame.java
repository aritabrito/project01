package org.academiadecodigo.hexallents.simplegfx;

import org.academiadecodigo.hexallents.Level;
import org.academiadecodigo.hexallents.rectangle.ImmutableSquare;
import org.academiadecodigo.hexallents.rectangle.MutableSquare;
import org.academiadecodigo.hexallents.rectangle.Square;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class GridGame {

    public static final int PADDING = 10;
    public final static int CELL_SIZE = 100;
    private Rectangle gridLine;
    private Square[][] squares;
    private int[][] currentLevel;
    private Level level;


    public GridGame() {
        level = new Level();
        currentLevel = level.level2();
        int gridSize = currentLevel.length;
        squares = new Square[gridSize][gridSize];
    }

    public void init() {

        System.out.println("initiating game");


        for (int i = 0; i < currentLevel.length; i++) {

            for (int j = 0; j < currentLevel[i].length; j++) {

                if (currentLevel[i][j] == 0) {
                    squares[i][j] = new MutableSquare(j, i, ColorMapper.getColor(ColorEnum.BLACK));
                    squares[i][j].setSquare(j * CELL_SIZE + PADDING, i * CELL_SIZE + PADDING,
                            CELL_SIZE, CELL_SIZE);
                    gridLine = new Rectangle(j * CELL_SIZE + PADDING, i * CELL_SIZE + PADDING,
                            CELL_SIZE, CELL_SIZE);
                    gridLine.setColor(Color.DARK_GRAY);
                    gridLine.draw();

                }
                for (int k = 1; k < ColorEnum.values().length; k++) {
                    if (currentLevel[i][j] == k) {
                        squares[i][j] = new ImmutableSquare(j, i, ColorMapper.getColor(ColorEnum.values()[k]));
                        squares[i][j].setSquare(j * CELL_SIZE + PADDING, i * CELL_SIZE + PADDING,
                                CELL_SIZE, CELL_SIZE);
                        gridLine = new Rectangle(j * CELL_SIZE + PADDING, i * CELL_SIZE + PADDING,
                                CELL_SIZE, CELL_SIZE);
                        gridLine.setColor(Color.DARK_GRAY);
                        gridLine.draw();
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
        if (sqr instanceof ImmutableSquare) {
            return sqr.getColor();
        }
        return null;
    }

    public void setColor(Square sqr, Color color) {
        if (sqr instanceof MutableSquare) {
            sqr.setColor(color);
        }
    }

    public int conversionXY(int xOrY) {
        return (xOrY / CELL_SIZE);
    }

    public int rowToY(int row) {
        return CELL_SIZE * row + PADDING;
    }

    public int columnToX(int column) {
        return CELL_SIZE * column + PADDING;
    }

    public Square[][] getSquares() {
        return squares;
    }
    public void setLevel(Level level){
        this.level = level;
    }
}
