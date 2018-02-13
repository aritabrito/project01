package org.academiadecodigo.hexallents.rectangle;

import org.academiadecodigo.hexallents.grid.Grid;
import org.academiadecodigo.hexallents.simplegfx.ColorEnum;
import org.academiadecodigo.hexallents.simplegfx.SimpleGfxColorMapper;
import org.academiadecodigo.hexallents.simplegfx.SimpleGfxGrid;
import org.academiadecodigo.simplegraphics.graphics.Color;

/**
 * Created by codecadet on 10/02/2018.
 */
public class SquareFactory {

    // public static Car getNewCar(Grid grid) {}
    // método para criar um array multidimensional com arrays de 2 rectângulos
    // rectangulos: número de pares de rectangulos para cada jogo


    Square square;

// public static Car getNewCar(Grid grid) {}
// método para criar um array multidimensional com arrays de 2 rectângulos
// rectangulos: número de pares de rectangulos para cada jogo


    public static Square[][] getRectangles( SimpleGfxGrid grid) {

        Square[][] rectanglesContainer = new Square[grid.getCols()+1][5];

        Square[] twoRects = new Square[2];
        rectanglesContainer[0] = twoRects;

        Square[] twoRects1 = new Square[2];
        rectanglesContainer[1] = twoRects1;

        Square[] twoRects2 = new Square[2];
        rectanglesContainer[2] = twoRects2;

        Square[] twoRects3 = new Square[2];
        rectanglesContainer[3] = twoRects2;

        Square[] twoRects4 = new Square[2];
        rectanglesContainer[4] = twoRects2;

        Square[] brancos = new Square[15];
        rectanglesContainer[5] = brancos;

        ColorEnum[] colors = ColorEnum.values();


        for (int i = 0; i < rectanglesContainer.length; i++) {
            int colorCounter= 0;
            Color color = SimpleGfxColorMapper.getColor(colors[colorCounter]);

            // preencher o container com um array de 2 crectangulos
            // confirmar se já não existem outros rects com a mesma cor
            twoRects[0] = new Square(0, 0, grid, Color.RED);
            twoRects[1] = new Square(1, 4, grid, Color.RED);

            twoRects1[0] = new Square(2, 0, grid, Color.BLUE);
            twoRects1[1] = new Square(1, 3, grid, Color.BLUE);

            twoRects2[0] = new Square(2, 1, grid, Color.MAGENTA);
            twoRects2[1] = new Square(2, 4, grid, Color.MAGENTA);

            twoRects3[0] = new Square(4, 0, grid, Color.GREEN);
            twoRects3[1] = new Square(3, 3, grid, Color.GREEN);

            twoRects4[0] = new Square(4, 1, grid, Color.ORANGE);
            twoRects4[1] = new Square(3, 4, grid, Color.ORANGE);
        }

        // atribuir uma cor do enum
        // verificar se cor repetida

        return rectanglesContainer;
    }

}




