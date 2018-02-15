package org.academiadecodigo.hexallents.rectangle;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 10/02/2018.
 */
public abstract class Square{


    private Rectangle rectangle;
    private int col;
    private int row;
    protected Color color;

    public Square(int col, int row, Color color) {
       this.col = col;
       this.row = row;
       this.color = color;
    }

    public void setSquare(int x1, int y1, int x2, int y2){
        this.rectangle = new Rectangle(x1,y1,x2,y2);
        rectangle.setColor(color);
        rectangle.fill();
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }
}
