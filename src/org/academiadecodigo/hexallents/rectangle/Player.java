package org.academiadecodigo.hexallents.rectangle;

import org.academiadecodigo.hexallents.simplegfx.ColorEnum;
import org.academiadecodigo.hexallents.simplegfx.ColorMapper;
import org.academiadecodigo.hexallents.simplegfx.GridGame;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

import java.lang.invoke.SwitchPoint;

/**
 * Created by codecadet on 10/02/2018.
 */
public class Player implements MouseHandler {

    private Mouse myMouse;
    private GridGame grid;
    private boolean selected;
    private Color selectedColor;
    private Square selectedSquare;
    private Square currentSquare;

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

        selectedSquare = grid.getSquare((int) mouseEvent.getX(), (int) mouseEvent.getY());

        System.out.println((int) mouseEvent.getX() + " mouse " + (int) mouseEvent.getY());
        if (!selected) {
            selected = true;

            if (grid.getColor(selectedSquare) == null && selectedSquare == null) {
                return;
            }
            selectedColor = grid.getColor(selectedSquare);

            System.out.println(selectedColor);

            System.out.println(selected + " CLICK");
        }
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

        if (selected) {
            currentSquare = grid.getSquare((int) mouseEvent.getX(), (int) mouseEvent.getY());

            if (currentSquare instanceof ImmutableSquare && !currentSquare.equals(selectedSquare) &&
                    currentSquare.getColor().equals(selectedColor)) {
                System.out.println("PÁRA!!!!");
                selected = false;
                return;
            }
            if (currentSquare.getColor() == ColorMapper.getColor(ColorEnum.BLACK)) {

                if (currentSquare.getY2() <= selectedSquare.getY2() + GridGame.CELL_SIZE ||
                        currentSquare.getX2() <= selectedSquare.getX2() + GridGame.CELL_SIZE ||
                        currentSquare.getY2() <= selectedSquare.getY2() - GridGame.CELL_SIZE ||
                        currentSquare.getX2() <= selectedSquare.getX2() - GridGame.CELL_SIZE) {


                    grid.setColor(currentSquare, selectedColor);
                }

            }
            return;
        }
    }

    private boolean inBounds(double x, double y) {
        return x < grid.columnToX(5) && y < grid.rowToY(5);

    }
}



