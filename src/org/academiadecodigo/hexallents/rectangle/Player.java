package org.academiadecodigo.hexallents.rectangle;

import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

/**
 * Created by codecadet on 10/02/2018.
 */
public class Player extends Rectangle implements MouseHandler{


    // tem os eventos do rato
    // tem acesso à gralha e às células

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

        // quando click no rectângulo pinto as células da mesma cor do rectângulo em que clickou
        // tem que saber a cor desse mesmo rectângulo
        // activa o mouse move

        // clicko para desactivar o mouseMoved


        // quando preenchido, se clickar no rectangulo limpo a jogada dessa cor


    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

        // pinta as células da cor do rectangulo inicial, enquanto se move

        // colision -> para verificar se pode pode preencher ou não
        // collision -> quando encontra uma célula da mesma cor pode entrar para terminar a jogada

        // em caso de engano, permitir por a celula na cor inicial se ela tiver anteriormente a cor do rectangulo inicial




    }



}
