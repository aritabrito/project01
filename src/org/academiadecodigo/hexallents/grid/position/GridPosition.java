package org.academiadecodigo.hexallents.grid.position;

import org.academiadecodigo.hexallents.grid.GridColor;

/**
 * Created by codecadet on 10/02/2018.
 */
public interface GridPosition {

    /**
     * Gets the position column in the grid
     *
     * @return the position column
     */
    public int getCol();

    /**
     * Gets the position row in the grid
     *
     * @return the position row
     */
    public int getRow();

    /**
     * Updates the position column and row
     *
     * @param col the new position column
     * @param row the new position row
     */
    public void setPos(int col, int row);

    /**
     * Gets the position getColor
     *
     * @return the position getColor
     */
    public GridColor getColor();

    /**
     * Changes the getColor of this grid position
     *
     * @param color the new position getColor
     */
    public void setColor(GridColor color);

    /**
     * Displays the position in the grid
     */
    public void show();

}