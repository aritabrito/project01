package org.academiadecodigo.hexallents.rectangle;
import org.academiadecodigo.hexallents.simplegfx.GridGame;
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

        if (!selected) {
            selected = true;
            System.out.println("SELECTED " + selectedSquare.toString());
            if (grid.getColor(selectedSquare) == null || selectedSquare == null) {
                return;
            }
            selectedColor = grid.getColor(selectedSquare);
        } else {
            grid.init();
            selected = false;
            selectedSquare = null;
            selectedColor = null;
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
                return;
            }
            if (currentSquare.getColor() == Color.BLACK) {

                if (currentSquare.getY2() <= selectedSquare.getY2() + GridGame.CELL_SIZE ||
                        currentSquare.getX2() <= selectedSquare.getX2() + GridGame.CELL_SIZE ||
                        currentSquare.getY2() <= selectedSquare.getY2() - GridGame.CELL_SIZE ||
                        currentSquare.getX2() <= selectedSquare.getX2() - GridGame.CELL_SIZE) {


                    grid.setColor(currentSquare, selectedColor);
                }
            }
        }
    }

    private boolean inBounds(double x, double y) {
        return x < grid.columnToX(5) && y < grid.rowToY(5);

    }
}



