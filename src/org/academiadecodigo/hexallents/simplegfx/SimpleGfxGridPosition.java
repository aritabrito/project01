package org.academiadecodigo.hexallents.simplegfx;

import org.academiadecodigo.hexallents.grid.GridColor;
import org.academiadecodigo.hexallents.grid.position.AbstractGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 10/02/2018.
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {
    private Rectangle rectangle;

    /**
     * Simple graphics position constructor
     * @param col position column
     * @param row position row
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(int col, int row, SimpleGfxGrid grid){
        super(col, row, grid);
        rectangle = new Rectangle(grid.columnToX(col),grid.rowToY(row), grid.getCellSize(),grid.getCellSize());

        rectangle.setColor(Color.GREEN);
        rectangle.draw();


        show();
    }


    @Override
    public void show() {
        rectangle.setColor(Color.BLUE);
        rectangle.draw();

        rectangle.fill();
    }


    /**
     * @see AbstractGridPosition#setColor(GridColor)
     */
    @Override
    public void setColor(GridColor color) {
        rectangle.setColor(SimpleGfxColorMapper.getColor(color));
        super.setColor(color);
    }
}
