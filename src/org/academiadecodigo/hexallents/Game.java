package org.academiadecodigo.hexallents;

import org.academiadecodigo.hexallents.rectangle.MutableSquare;
import org.academiadecodigo.hexallents.rectangle.Player;
import org.academiadecodigo.hexallents.rectangle.Square;
import org.academiadecodigo.hexallents.simplegfx.ColorEnum;
import org.academiadecodigo.hexallents.simplegfx.ColorMapper;
import org.academiadecodigo.hexallents.simplegfx.GridGame;
import org.academiadecodigo.simplegraphics.graphics.Color;

/**
 * Created by codecadet on 10/02/2018.
 */
public class Game {

    private GridGame grid;
    private Player player;

    Game() {
        grid = new GridGame();
        player = new Player(grid);
    }

    public void init() {

        grid.init();
        player.keyEvents();
    }

    public void start() {
        while (true) {

        }

    }

    private boolean checkVictory() {
        Square[][] squareIterator = grid.getSquares();
        while (true) {
            for (int i = 0; i < squareIterator.length; i++) {
                for (int j = 0; j < squareIterator[i].length; j++) {
                    if (squareIterator[j][i].getColor() == Color.BLACK) {
                        System.out.println("Não quero pretos");
                        break;
                    } else if (squareIterator[j][i] instanceof MutableSquare) {
                        for (int k = 1; k < ColorEnum.values().length; k++) {
                             Color color = ColorMapper.getColor(ColorEnum.values()[k]);

                            if(squareIterator[j][i].getColor() == color){
                                System.out.println("Há um de cada cor, menos o preto porque não gostamos de pretos.");
                                return true;

                            }
                        }
                    }
                }
            }
        }
    }
}
