package org.academiadecodigo.hexallents.rectangle;

import org.academiadecodigo.hexallents.CollisionDetector;
import org.academiadecodigo.hexallents.grid.position.AbstractGridPosition;
import org.academiadecodigo.hexallents.simplegfx.SimpleGfxGrid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 10/02/2018.
 */
public class Square extends AbstractGridPosition  {

    // método para garantir que o rectangulo é posicionado dentro dos limites da grelha

    private Rectangle rectangle;
    private Color color;
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    private boolean selected;



    // Allow direct access from subclasses
    protected CollisionDetector collisionDetector;

    public Square(int col, int row, SimpleGfxGrid grid, Color color){
        super(col, row, grid);
        x1 = grid.columnToX(this.getCol());
        y1 = grid.rowToY(this.getRow());
        x2 = grid.getCellSize();
        y2 = grid.getCellSize();
        rectangle = new Rectangle(x1,y1,x2,y2);
        rectangle.fill();
        rectangle.setColor(color);

        selected = false;
    }

    public void setCollisionDetector(CollisionDetector collisionDetector) {
        this.collisionDetector = collisionDetector;
    }

    public Color getColor(){
        return rectangle.getColor();
    }

    public int getX1(){
        return x1;
    }
    public int getY1(){
        return y1;
    }
    public int getX2(){
        return x2;
    }
    public int getY2(){
        return y2;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected() {
        this.selected = true;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
