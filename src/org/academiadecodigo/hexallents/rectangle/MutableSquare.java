package org.academiadecodigo.hexallents.rectangle;
import org.academiadecodigo.hexallents.simplegfx.ColorMapper;
import org.academiadecodigo.simplegraphics.graphics.Color;


public class MutableSquare extends Square {

    private Color color;


    public MutableSquare(int col, int row, Color color) {
        super(col, row);
        this.color = color;

    }
}
