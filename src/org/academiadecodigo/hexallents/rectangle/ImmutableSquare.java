package org.academiadecodigo.hexallents.rectangle;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class ImmutableSquare extends Square {


    private boolean abused;

    public ImmutableSquare(int col, int row, Color color) {
        super(col, row, color);
    }

    public boolean isAbused() {
        return abused;
    }

    public void setAbused(boolean abused) {
        this.abused = abused;
    }
}
