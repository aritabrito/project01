package org.academiadecodigo.hexallents.rectangle;

import org.academiadecodigo.hexallents.simplegfx.GridGame;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

/**
 * Created by codecadet on 10/02/2018.
 */
public class Player implements MouseHandler {

    private Mouse myMouse;
    private GridGame grid;
    private boolean selected;
    private Color selectedColor;

    public Player(GridGame grid) {
        this.grid = grid;
        myMouse = new Mouse(this);
        selected = false;
    }


    public void keyEvents() {

        myMouse.addEventListener(MouseEventType.MOUSE_CLICKED);
        myMouse.addEventListener(MouseEventType.MOUSE_MOVED);

    }


    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

        Square selectedSquare = grid.getSquare((int) mouseEvent.getX(), (int) mouseEvent.getY());

        System.out.println((int)mouseEvent.getX() + " mouse " + (int)mouseEvent.getY());

        selected = true;

        selectedColor = grid.getColor(selectedSquare);

        System.out.println(grid.getColor(selectedSquare));

        System.out.println(selected + " CLICK");
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        if (selected) {
            grid.setColor((int) mouseEvent.getX(), (int) mouseEvent.getY(), selectedColor);
            System.out.println("move");
        }
    }

}

