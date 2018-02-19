package org.academiadecodigo.hexallents.gameEngine;

import org.academiadecodigo.hexallents.squares.ImmutableSquare;
import org.academiadecodigo.hexallents.squares.Square;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

public class Player implements MouseHandler, KeyboardHandler {

    private Mouse myMouse;
    private Keyboard myKeyboard;
    private GridGame grid;
    private boolean selected;
    private Color selectedColor;
    private Square selectedSquare;
    private Square currentSquare;

    public Player(GridGame grid) {
        this.grid = grid;
        myMouse = new Mouse(this);
        myKeyboard = new Keyboard(this);
        selected = false;
    }

    public void keyEvents() {

        myMouse.addEventListener(MouseEventType.MOUSE_CLICKED);
        myMouse.addEventListener(MouseEventType.MOUSE_MOVED);

        KeyboardEvent spaceKey = new KeyboardEvent();
        spaceKey.setKey(KeyboardEvent.KEY_SPACE);
        spaceKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

        selectedSquare = grid.getSquare((int) mouseEvent.getX(), (int) mouseEvent.getY());

        System.out.println("CLICK. --------------------------------------------------------------");
        if (!selected && !selectedSquare.isUsed() && selectedSquare.getColor() != Color.BLACK) {
            selected = true;
            System.out.println("SELECTED " + selectedSquare.toString());
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
                System.out.println("PAIRED ------------------------------------------------------");
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

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if(keyboardEvent.getKey() == KeyboardEvent.KEY_S){
            grid.initGrid();
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }


}



