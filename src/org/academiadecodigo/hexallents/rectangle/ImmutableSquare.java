package org.academiadecodigo.hexallents.rectangle;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class ImmutableSquare extends Square {

    private final Color COLOR;

    public ImmutableSquare(int col, int row, Color color) {
        super(col, row);
        COLOR = color;
    }

    public Color getCOLOR() {
        return COLOR;
    }
}
