package org.academiadecodigo.hexallents.rectangle;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 10/02/2018.
 */
public abstract class Square {

    // método para garantir que o rectangulo é posicionado dentro dos limites da grelha

    private Rectangle rectangle;
    private int col;
    private int row;

    public Square(int col, int row) {
       this.col = col;
       this.row = row;
       this.rectangle = new Rectangle();
       rectangle.fill();
    }


}
