package org.academiadecodigo.hexallents.rectangle;

import org.academiadecodigo.hexallents.grid.Grid;

/**
 * Created by codecadet on 10/02/2018.
 */
public class RectangleFactory {

    // public static Car getNewCar(Grid grid) {}
    // método para criar um array multidimensional com arrays de 2 rectângulos
    // rectangulos: número de pares de rectangulos para cada jogo


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
            twoRects[0] = new Rectangle(grid.makeGridPosition(0,0));
            twoRects[1] = new Rectangle(grid.makeGridPosition(1, 4));
            
        }

        // atribuir uma cor do enum
        // verificar se cor repetida

        return rectanglesContainer;
    }



}




