package org.academiadecodigo.hexallents.grid.position;

import org.academiadecodigo.hexallents.grid.Grid;
import org.academiadecodigo.hexallents.grid.GridColor;

/**
 * Created by codecadet on 10/02/2018.
 */
public class AbstractGridPosition implements GridPosition {

    private int col;
    private int row;
    private GridColor color;
    private Grid grid;

    /**
     * Construct a new grid position at a specific column and row
     *
     * @param col   the column of the grid position
     * @param row   the row of the grid position
     * @param grid  the grid in which the position will be displayed
     */
    public AbstractGridPosition(int col, int row, Grid grid) {
        this.col = col;
        this.row = row;
        this.grid = grid;
        this.color = GridColor.NOCOLOR;
    }

    public Grid getGrid() {
        return grid;
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
    @Override
    public GridColor getColor() {
        return color;
    }

    /**
     * @see GridPosition#setColor(GridColor)
     */
    @Override
    public void setColor(GridColor color) {
        this.color = color;
        show();
    }

    @Override
    public void show() {

    }

    @Override
    public String toString() {
        return "GridPosition{" +
                "col=" + col +
                ", row=" + row +
                ", getColor=" + color +
                '}';
    }
}


