package org.academiadecodigo.hexallents.rectangle;

import org.academiadecodigo.hexallents.grid.Grid;
import org.academiadecodigo.hexallents.simplegfx.ColorEnum;
import org.academiadecodigo.hexallents.simplegfx.SimpleGfxColorMapper;
import org.academiadecodigo.hexallents.simplegfx.SimpleGfxGrid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

/**
 * Created by codecadet on 10/02/2018.
 */
public class Player implements MouseHandler {
    private Rectangle rectangle;
    private Mouse myMouse;
    private Square[][] squares;
    private SimpleGfxGrid grid;
    ColorEnum[] colors = ColorEnum.values();



    public Player(SimpleGfxGrid grid) {
        myMouse = new Mouse(this);
        squares = SquareFactory.getRectangles(grid);
        this.grid = grid;

        //keyEvents();
    }

    // tem os eventos do rato
    // tem acesso à grelha e às células


    public void keyEvents() {

        myMouse.addEventListener(MouseEventType.MOUSE_CLICKED);
        myMouse.addEventListener(MouseEventType.MOUSE_MOVED);

        //  toTest.getPos().getColor()


        //MouseEvent clickOne = new MouseEvent(grid.getX(), grid.getY(), MouseEventType.MOUSE_CLICKED);
        //myMouse.addEventListener();

    }


    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

        // quando click no rectângulo pinto as células da mesma cor do rectângulo em que clickou
        // tem que saber a cor desse mesmo rectângulo
        // activa o mouse move

        // clicko para desactivar o mouseMoved


        // quando preenchido, se clickar no rectangulo limpo a jogada dessa cor


        Square toTest = squares[0][0];
        if (mouseEvent.getX() >= SimpleGfxGrid.PADDING && mouseEvent.getX() <= SimpleGfxGrid.PADDING + SimpleGfxGrid.CELL_SIZE &&
                mouseEvent.getY() >= SimpleGfxGrid.PADDING && mouseEvent.getY() <= SimpleGfxGrid.PADDING + SimpleGfxGrid.CELL_SIZE) {

            // adquire a cor e arrasta
            /*toTest.translate(SimpleGfxGrid.CELL_SIZE,SimpleGfxGrid.PADDING);
            Square test = new Square(grid.makeGridPosition(0,1,SimpleGfxColorMapper.getColor(colors[2])));
            test.fill();*/
            System.out.println("click" + mouseEvent.toString());
        } else {
            System.out.println("fora");
        }
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

        /*
        Square test = new Square(grid.makeGridPosition(0,1,SimpleGfxColorMapper.getColor(colors[2])));
        test.fill();*/
        // pinta as células da cor do rectangulo inicial, enquanto se move

        // colision -> para verificar se pode pode preencher ou não
        // collision -> quando encontra uma célula da mesma cor pode entrar para terminar a jogada

        // em caso de engano, permitir por a celula na cor inicial se ela tiver anteriormente a cor do rectangulo inicial


    }
}
