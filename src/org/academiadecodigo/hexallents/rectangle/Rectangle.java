package org.academiadecodigo.hexallents.rectangle;

import org.academiadecodigo.hexallents.CollisionDetector;
import org.academiadecodigo.hexallents.grid.Grid;
import org.academiadecodigo.hexallents.grid.GridColor;
import org.academiadecodigo.hexallents.grid.GridDirection;
import org.academiadecodigo.hexallents.grid.position.AbstractGridPosition;
import org.academiadecodigo.hexallents.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;

/**
 * Created by codecadet on 10/02/2018.
 */
public class Rectangle {

    // método para garantir que o rectangulo é posicionado dentro dos limites da grelha

    private Rectangle rectangle;
    private GridPosition pos;
    private Grid grid;
    private Color color;


    // Allow direct access from subclasses
    protected CollisionDetector collisionDetector;
    protected GridDirection currentDirection;


    public Rectangle(GridPosition pos, Color color) {
        this.pos = pos;
        this.color = color;
    }

    public Rectangle(GridPosition pos) {
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public GridPosition getPos() {
        return pos;
    }

    public void setCollisionDetector(CollisionDetector collisionDetector) {
        this.collisionDetector = collisionDetector;
    }
}
