package org.academiadecodigo.hexallents.gameEngine;

import org.academiadecodigo.hexallents.squares.ImmutableSquare;
import org.academiadecodigo.hexallents.squares.MutableSquare;
import org.academiadecodigo.hexallents.squares.Square;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class GridGame {

    public static final int PADDING = 10;
    public final static int CELL_SIZE = 100;
    private Level level;
    private Rectangle gridLine;
    private Square[][] squares;
    private int[][] currentLevel;


    public GridGame() {
        level = new Level();
    }

    public void initGrid() {

        if (squares != null) {
            deleteLevel();
        }

        squares = new Square[currentLevel.length][currentLevel.length];
        System.out.println( "LEVEL LENGTH " + currentLevel.length + "jkwbfkjbbsdjbfskjdbfjkbsdjfbskjdfbsjkfbskdbfjksbdfkjbsdjkfbsjkdbfjkbfdjkbsjkdbfjksfbjskdb");

        System.out.println("initiating game");
        for (int i = 0; i < currentLevel.length; i++) {

            for (int j = 0; j < currentLevel[i].length; j++) {

                if (currentLevel[i][j] == 0) {
                    squares[i][j] = new MutableSquare(i, j, ColorMapper.getColor(ColorEnum.BLACK));
                    squares[i][j].show(j * CELL_SIZE + PADDING, i * CELL_SIZE + PADDING,
                            CELL_SIZE, CELL_SIZE);
                    squares[i][j].setUsed(false);


                    gridLine = new Rectangle(j * CELL_SIZE + PADDING, i * CELL_SIZE + PADDING,
                            CELL_SIZE, CELL_SIZE);
                    gridLine.setColor(Color.DARK_GRAY);
                    gridLine.draw();

                }
                for (int k = 1; k < ColorEnum.values().length; k++) {
                    if (currentLevel[i][j] == k) {
                        squares[i][j] = new ImmutableSquare(i, j, ColorMapper.getColor(ColorEnum.values()[k]));
                        squares[i][j].show(j * CELL_SIZE + PADDING, i * CELL_SIZE + PADDING,
                                CELL_SIZE, CELL_SIZE);
                        squares[i][j].setUsed(false);

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
        System.out.println(x + "  " + y);
        int xS = conversionX(x);
        int yS = conversionY(y);
        System.out.println(xS + " " + yS);
        System.out.println("RETORNO DO QUADRADO " + yS + " " + xS);
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

    private int conversionX(int x) {
        return (x - PADDING) / CELL_SIZE;
    }

    private int conversionY(int y) {
        return (y - PADDING - 23) / CELL_SIZE;
    }

    public boolean checkIfComplete() {
        for (int i = 0; i < squares.length; i++) {
            for (int j = 0; j < squares[i].length; j++) {
                if (squares[j][i].getColor().equals(Color.BLACK) && !squares[j][i].isUsed()) {
                    return false;
                }
            }
        }
        return true;
    }


    public void nextLevel(int i) {
        currentLevel = level.setLevel(i);
    }

    public void deleteLevel() {
        for (int i = 0; i < squares.length; i++) {
            for (int j = 0; j < squares[i].length; j++) {
                squares[j][i].hide();
                System.err.println("deleting level ------------------------------------------------------------------");
            }
        }
    }
}
