package org.academiadecodigo.hexallents.gameEngine;

import org.academiadecodigo.hexallents.squares.ImmutableSquare;
import org.academiadecodigo.hexallents.squares.Square;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

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
        System.out.println(selectedSquare);
        System.out.println("CLICK. --------------------------------------------------------------");
        if (!selected && !selectedSquare.isUsed() && selectedSquare.getColor() != Color.BLACK) {
            selected = true;
            if (grid.getColor(selectedSquare) == null || selectedSquare == null) {
                System.out.println("clicking null squares");
                return;
            }
            selectedSquare.setUsed(true);
            selectedColor = grid.getColor(selectedSquare);
        } else {
            grid.setColor(selectedSquare, Color.BLACK);
            selectedSquare.setUsed(false);
            selected = false;
        }
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

        if (selectedSquare == null || selectedColor == null) {
            return;
        }

        if (selected) {
            currentSquare = grid.getSquare((int) mouseEvent.getX(), (int) mouseEvent.getY());

            if (currentSquare instanceof ImmutableSquare && !currentSquare.equals(selectedSquare) &&
                    currentSquare.getColor().equals(selectedColor)) {
                selected = false;
                currentSquare.setUsed(true);
                System.out.println("PAIRED. -------------------------------------------------------------");
                return;
            }
            if (currentSquare.getColor() == Color.BLACK) {

                if (currentSquare.getY2() <= selectedSquare.getY2() + GridGame.CELL_SIZE ||
                        currentSquare.getX2() <= selectedSquare.getX2() + GridGame.CELL_SIZE ||
                        currentSquare.getY2() <= selectedSquare.getY2() - GridGame.CELL_SIZE ||
                        currentSquare.getX2() <= selectedSquare.getX2() - GridGame.CELL_SIZE &&
                                !currentSquare.isUsed()) {

                    currentSquare.setUsed(true);
                    grid.setColor(currentSquare, selectedColor);
                }
            }
        }
    }



}



