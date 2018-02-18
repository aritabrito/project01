package org.academiadecodigo.hexallents.gameEngine;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Menu {
    private Picture picture;

    public void showImage(){
        picture = new Picture();
        picture.load("/Users/codecadet/Desktop/ProjectGame/project01/resources/flow-free-01.png");
        picture.translate(10, 10);
        picture.draw();
    }

    public void hideImage() {
        picture.delete();
    }

}
