package org.academiadecodigo.hexallents.rectangle;

import org.academiadecodigo.hexallents.grid.Grid;
import org.academiadecodigo.hexallents.grid.GridColor;
import org.academiadecodigo.hexallents.simplegfx.SimpleGfxColorMapper;
import org.academiadecodigo.simplegraphics.graphics.Color;

/**
 * Created by codecadet on 10/02/2018.
 */
public class RectangleFactory {

    Rectangle rectangle;

    // public static Car getNewCar(Grid grid) {}
    // método para criar um array multidimensional com arrays de 2 rectângulos
    // rectangulos: número de pares de rectangulos para cada jogo


    public static Rectangle[][] getRectangles(Grid grid) {

        Rectangle[][] rectanglesContainer = new Rectangle[grid.getCols()][2];

        Rectangle[] twoRects = new Rectangle[2];
        rectanglesContainer[0] = twoRects;

        for (int i = 0; i < rectanglesContainer.length; i++) {

            // preencher o container com um array de 2 crectangulos
            // confirmar se já não existem outros rects com a mesma cor
            twoRects[0] = new Rectangle(grid.makeGridPosition(0,0), Color.RED);
            twoRects[1] = new Rectangle(grid.makeGridPosition(1, 4), Color.RED);
        }

        // atribuir uma cor do enum
        // verificar se cor repetida

        return rectanglesContainer;
    }



}




