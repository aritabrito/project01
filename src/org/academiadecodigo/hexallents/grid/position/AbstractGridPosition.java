package org.academiadecodigo.hexallents.grid.position;

import org.academiadecodigo.hexallents.grid.Grid;
import org.academiadecodigo.hexallents.simplegfx.ColorEnum;
import org.academiadecodigo.hexallents.simplegfx.SimpleGfxColorMapper;
import org.academiadecodigo.hexallents.simplegfx.SimpleGfxGrid;
import org.academiadecodigo.simplegraphics.graphics.Color;

/**
 * Created by codecadet on 10/02/2018.
 */
public class AbstractGridPosition implements GridPosition {

    private int col;
    private int row;
    private Grid grid;

    /**
     * Construct a new grid position at a specific column and row
     *
     * @param col   the column of the grid position
     * @param row   the row of the grid position
     * @param grid  the grid in which the position will be displayed
     */
    public AbstractGridPosition(int col, int row, SimpleGfxGrid grid) {
        this.col = col;
        this.row = row;
        this.grid = grid;

    }

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    /**
     * @see GridPosition#setPos(int, int)
     */
    @Override
    public void setPos(int col, int row) {
        this.col = col;
        this.row = row;
        show();
    }

    @Override
    public Color getColor() {
        return null;
    }

    /**
     * @see GridPosition#getCol()
     */
    @Override
    public int getCol() {
        return col;
    }

    /**
     * @see GridPosition#getRow()
     */
    @Override
    public int getRow() {
        return row;
    }

    /**
     * @see GridPosition#getColor()
     */
   /* @Override
    public Color getColor() {
        return color;
    }*/


    /*@Override
   public void setColor(ColorEnum color) {
        this.color = SimpleGfxColorMapper.getColor(color);
    }*/

    @Override
    public void show() {

    }

    /*@Override
    public String toString() {
        return "GridPosition{" +
                "col=" + col +
                ", row=" + row +
                ", getColor=" + color +
                '}';
    }*/
}


