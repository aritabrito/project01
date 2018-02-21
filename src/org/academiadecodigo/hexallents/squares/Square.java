package org.academiadecodigo.hexallents.squares;

import org.academiadecodigo.hexallents.gameEngine.Grid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 10/02/2018.
 */
public abstract class Square {

    private final int row;
    private final int col;
    private Rectangle rectangle;
    private boolean used;

    public Square(int col, int row, Color color) {
        this.col = col;
        this.row = row;
        this.rectangle = new Rectangle(col * Grid.CELL_SIZE + Grid.PADDING,
                row * Grid.CELL_SIZE + Grid.PADDING,
                Grid.CELL_SIZE,
                Grid.CELL_SIZE);
        rectangle.setColor(color);
        rectangle.fill();
    }

    public Color getColor() {
        return rectangle.getColor();
    }

    public void setColor(Color color) {
        rectangle.setColor(color);
    }

    public boolean isUsed() {
        return used;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    @Override
    public String toString() {
        return "Square{" +
                '}' + super.toString();
    }
}

