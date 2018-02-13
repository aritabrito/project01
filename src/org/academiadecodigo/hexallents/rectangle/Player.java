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

import java.awt.event.MouseListener;

/**
 * Created by codecadet on 10/02/2018.
 */
public class Player implements MouseHandler {
    private Rectangle rectangle;
    private Mouse myMouse;
    private Square[][] squares;
    private SimpleGfxGrid grid;
    private Color color;
    private boolean selected;

    public Player(SimpleGfxGrid grid) {
        myMouse = new Mouse(this);
        this.grid = grid;
        squares = SquareFactory.getRectangles(grid);
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

        //rectangle = toTest.getRectangle();

        for (int i = 0; i < squares.length; i++) {
            for (int j = 0; j < squares[i].length; j++) {

                Square sqr = squares[i][j];
                if (mouseEvent.getX() >= sqr.getX1() && mouseEvent.getX() <= sqr.getX1() + sqr.getX2() &&
                        mouseEvent.getY() >= sqr.getY1() && mouseEvent.getY() <= sqr.getY1() + sqr.getY2()) {
                    squares[i][j].setSelected(); // se selected activa mouse moved
                    color = squares[i][j].getColor();
                    selected = squares[i][j].isSelected();
                    System.out.println("click");
                    break;
                }


                // adquire a cor e arrasta
            /*toTest.translate(SimpleGfxGrid.CELL_SIZE,SimpleGfxGrid.PADDING);
            Square test = new Square(grid.makeGridPosition(0,1,SimpleGfxColorMapper.getColor(colors[2])));
            test.fill();*/
                System.out.println("fora");
            }
        }
    }






    /*public void moveOnly(MouseEvent mouseEvent){
        if (toTest.isSelected()){
            mouseMoved(mouseEvent);
        }*/

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        if (selected) {

            grid.getBackground().setColor(color);
            System.out.println("PINTA CARALHO!!!!!!!!!!!!");
        }

    }
        /*
        if (toTest.isSelected()) {
            System.out.println("foi seleccionado");
            rectangle = toTest.getRectangle();



            Square test = new Square(3,1,grid,color);

            test.getRectangle().fill();
        }*/

        /*
        Square test = new Square(3,1,grid,rectangle.getColor());

        test.getRectangle().fill();*/


    // pinta as células da cor do rectangulo inicial, enquanto se move

    // colision -> para verificar se pode pode preencher ou não
    // collision -> quando encontra uma célula da mesma cor pode entrar para terminar a jogada

    // em caso de engano, permitir por a celula na cor inicial se ela tiver anteriormente a cor do rectangulo inicial


}
