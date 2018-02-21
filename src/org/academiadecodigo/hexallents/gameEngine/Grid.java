package org.academiadecodigo.hexallents.gameEngine;

import org.academiadecodigo.hexallents.squares.MutableSquare;
import org.academiadecodigo.hexallents.squares.Square;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Grid {

    public static final int PADDING = 10;
    public static final int CELL_SIZE = 100;
    private Square[][] squares;

    public Grid(Square[][] squares) {
        this.squares = squares;
    }

    public Square getSquare(int x, int y) {
        int xS = conversionX(x);
        int yS = conversionY(y);
        return squares[yS][xS];
    }

    private int conversionX(int x) {
        return (x - PADDING) / CELL_SIZE;
    }

    private int conversionY(int y) {
        return (y - PADDING - 23) / CELL_SIZE;
    }

    public Square[][] getSquares() {
        return squares;
    }

    public Color getColor(Square sqr) {
        return sqr.getColor();
    }

    public void setColor(Square sqr, Color color) {
        if (sqr instanceof MutableSquare) {
            sqr.setColor(color);
        }
    }

}
