package org.academiadecodigo.hexallents.rectangle;

import org.academiadecodigo.hexallents.CollisionDetector;
import org.academiadecodigo.hexallents.grid.position.AbstractGridPosition;
import org.academiadecodigo.hexallents.simplegfx.ColorEnum;
import org.academiadecodigo.hexallents.simplegfx.SimpleGfxColorMapper;
import org.academiadecodigo.hexallents.simplegfx.SimpleGfxGrid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 10/02/2018.
 */
public class Square extends AbstractGridPosition {

    // método para garantir que o rectangulo é posicionado dentro dos limites da grelha

    private Rectangle rectangle;
    private Color color;


    // Allow direct access from subclasses
    protected CollisionDetector collisionDetector;

    public Square(int col, int row, SimpleGfxGrid grid, Color color){
        super(col, row, grid);
        rectangle = new Rectangle(grid.columnToX(this.getCol()),grid.rowToY(this.getRow()), grid.getCellSize(),grid.getCellSize());
        rectangle.fill();
        rectangle.setColor(color);
    }

    public void setCollisionDetector(CollisionDetector collisionDetector) {
        this.collisionDetector = collisionDetector;
    }

}
