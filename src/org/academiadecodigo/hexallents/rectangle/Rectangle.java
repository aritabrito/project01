package org.academiadecodigo.hexallents.rectangle;

import org.academiadecodigo.hexallents.CollisionDetector;
import org.academiadecodigo.hexallents.grid.Grid;
import org.academiadecodigo.hexallents.grid.GridColor;
import org.academiadecodigo.hexallents.grid.GridDirection;
import org.academiadecodigo.hexallents.grid.position.GridPosition;

/**
 * Created by codecadet on 10/02/2018.
 */
public class Rectangle {

    // método para garantir que o rectangulo é posicionado dentro dos limites da grelha


    private Rectangle rectangle;
    private GridPosition pos;
    private Grid grid;


    // Allow direct access from subclasses
    protected CollisionDetector collisionDetector;
    protected GridDirection currentDirection;

    /**
     * Constructs a new car
     *
     * @param pos     the initial car position
     */
    public Rectangle(GridPosition pos) {
        this.pos = pos;
        pos.setColor(GridColor.BLUE);
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
