package org.academiadecodigo.hexallents.simplegfx;

import org.academiadecodigo.simplegraphics.graphics.Color;

/**
 * Created by codecadet on 10/02/2018.
 */
public class ColorMapper {

    private static final Color colors[] = {
            Color.RED,
            Color.GREEN,
            Color.BLUE,
            Color.MAGENTA,
            Color.ORANGE,
            Color.YELLOW,
            Color.WHITE,
            Color.BLACK
    };

    public static Color getColor(ColorEnum color){

        Color sGfxColor = null;

        switch (color) {
            case BLACK:
                sGfxColor = colors[0];
                break;
            case RED:
                sGfxColor = colors[1];
                break;
            case BLUE:
                sGfxColor = colors[2];
                break;
            case MAGENTA:
                sGfxColor = colors[3];
                break;
            case ORANGE:
                sGfxColor = colors[4];
                break;
            case YELLOW:
                sGfxColor = colors[5];
                break;
            case WHITE:
                sGfxColor = colors[6];
                break;
        }
        return sGfxColor;
    }
}
