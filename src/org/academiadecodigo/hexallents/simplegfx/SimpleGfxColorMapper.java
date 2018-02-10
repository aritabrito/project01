package org.academiadecodigo.hexallents.simplegfx;

import org.academiadecodigo.hexallents.grid.GridColor;
import org.academiadecodigo.simplegraphics.graphics.Color;

/**
 * Created by codecadet on 10/02/2018.
 */
public class SimpleGfxColorMapper {

    private static final Color colors[] = {
            Color.RED,
            Color.GREEN,
            Color.BLUE,
            Color.MAGENTA,
            Color.WHITE,
            Color.YELLOW
    };

    public static Color getColor(GridColor color){

        Color sGfxColor = null;

        switch (color) {
            case RED:
                sGfxColor = colors[0];
                break;
            case GREEN:
                sGfxColor = colors[1];
                break;
            case BLUE:
                sGfxColor = colors[2];
                break;
            case MAGENTA:
                sGfxColor = colors[3];
                break;
            case YELLOW:
                sGfxColor = colors[4];
                break;
            case NOCOLOR:
                sGfxColor = colors[5];
                break;
            default:
                System.out.println("something went terribly wrong...");
        }

        return sGfxColor;
    }
}
