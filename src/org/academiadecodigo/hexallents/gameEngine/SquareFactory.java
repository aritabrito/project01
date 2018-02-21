package org.academiadecodigo.hexallents.gameEngine;

import org.academiadecodigo.hexallents.squares.ImmutableSquare;
import org.academiadecodigo.hexallents.squares.MutableSquare;
import org.academiadecodigo.hexallents.squares.Square;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import static org.academiadecodigo.hexallents.gameEngine.Grid.CELL_SIZE;
import static org.academiadecodigo.hexallents.gameEngine.Grid.PADDING;

public class SquareFactory {
    public static Square[][] getSquaresPerLevel(int level) {

        int[][] currentLevel = Level.getLevel(level);
        Square[][] squares = new Square[currentLevel.length][currentLevel[0].length];

        for (int i = 0; i < currentLevel.length; i++) {
            for (int j = 0; j < currentLevel[i].length; j++) {

                if (currentLevel[i][j] == 0) {
                    squares[i][j] = new MutableSquare(i, j, Color.BLACK);
                } else {
                    squares[i][j] = new ImmutableSquare(i, j, Color.BLUE);
                }

                squares[i][j].show(j * CELL_SIZE + PADDING, i * CELL_SIZE + PADDING,
                        CELL_SIZE, CELL_SIZE);
                Rectangle gridLine = new Rectangle(j * CELL_SIZE + PADDING, i * CELL_SIZE + PADDING,
                        CELL_SIZE, CELL_SIZE);
                gridLine.setColor(Color.DARK_GRAY);
                gridLine.draw();
            }
        }
        return squares;
    }
}
