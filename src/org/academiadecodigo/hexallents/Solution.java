package org.academiadecodigo.hexallents;

import org.academiadecodigo.hexallents.squares.Square;
import org.academiadecodigo.simplegraphics.graphics.Color;

public enum Solution {
    LEVEL1(
            new int[][]{
                    {3, 3, 3, 3, 3, 3},
                    {3, 3, 3, 3, 3, 3},
                    {3, 3, 3, 3, 3, 3},
                    {3, 3, 3, 3, 3, 3},
                    {3, 3, 3, 3, 3, 3},
                    {3, 3, 3, 3, 0, 0}
            }
    );

    private final int[][] level;

    Solution(int[][] level) {
        this.level = level;
    }

    public boolean isLevelCleared(Square[][] squares) {
        for (int i = 0; i < squares.length; i++) {
            for (int j = 0; j < squares[0].length; j++) {

                if (i == squares.length - 1 &&
                        (j == squares.length - 2 || j == squares.length - 1)) {
                    continue;
                }

                if (!(squares[i][j].getColor() == Color.BLUE)) {
                    return false;
                }
            }
        }
        return true;
    }
}
