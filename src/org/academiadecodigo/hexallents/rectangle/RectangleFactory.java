package org.academiadecodigo.hexallents.rectangle;

import org.academiadecodigo.hexallents.grid.Grid;
import org.academiadecodigo.hexallents.grid.GridColor;
import org.academiadecodigo.hexallents.grid.position.GridPosition;
import org.academiadecodigo.hexallents.simplegfx.SimpleGfxColorMapper;
import org.academiadecodigo.hexallents.simplegfx.SimpleGfxGrid;
import org.academiadecodigo.hexallents.simplegfx.SimpleGfxGridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;

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

        Rectangle[][] rectanglesContainer = new Rectangle[grid.getCols()][5];

        Rectangle[] twoRects = new Rectangle[2];
        rectanglesContainer[0] = twoRects;

        Rectangle[] twoRects1 = new Rectangle[2];
        rectanglesContainer[1] = twoRects1;

        Rectangle[] twoRects2 = new Rectangle[2];
        rectanglesContainer[2] = twoRects2;

        Rectangle[] twoRects3 = new Rectangle[2];
        rectanglesContainer[3] = twoRects2;

        Rectangle[] twoRects4 = new Rectangle[2];
        rectanglesContainer[4] = twoRects2;

        GridColor[] colors = GridColor.values();


        for (int i = 0; i < rectanglesContainer.length; i++) {
            int colorCounter= 0;
            Color color = SimpleGfxColorMapper.getColor(colors[colorCounter]);

            // preencher o container com um array de 2 crectangulos
            // confirmar se já não existem outros rects com a mesma cor
            twoRects[0] = new Rectangle(grid.makeGridPosition(0,0,SimpleGfxColorMapper.getColor(colors[0])));
            twoRects[1] = new Rectangle(grid.makeGridPosition(1, 4,SimpleGfxColorMapper.getColor(colors[0])));
            //colorCounter ++;

            twoRects1[0] = new Rectangle(grid.makeGridPosition(2,0,SimpleGfxColorMapper.getColor(colors[1])));
            twoRects1[1] = new Rectangle(grid.makeGridPosition(1, 3,SimpleGfxColorMapper.getColor(colors[1])));
            //colorCounter ++;

            twoRects2[0] = new Rectangle(grid.makeGridPosition(2,1,SimpleGfxColorMapper.getColor(colors[2])));
            twoRects2[1] = new Rectangle(grid.makeGridPosition(2, 4,SimpleGfxColorMapper.getColor(colors[2])));
            //colorCounter ++;

            twoRects3[0] = new Rectangle(grid.makeGridPosition(4,0,SimpleGfxColorMapper.getColor(colors[3])));
            twoRects3[1] = new Rectangle(grid.makeGridPosition(3, 3,SimpleGfxColorMapper.getColor(colors[3])));

            twoRects4[0] = new Rectangle(grid.makeGridPosition(4,1,SimpleGfxColorMapper.getColor(colors[4])));
            twoRects4[1] = new Rectangle(grid.makeGridPosition(3, 4,SimpleGfxColorMapper.getColor(colors[4])));
        }

        // atribuir uma cor do enum
        // verificar se cor repetida

        return rectanglesContainer;
    }


}




