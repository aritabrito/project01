package org.academiadecodigo.hexallents.gameEngine;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class EndScreen {
    public EndScreen() {
        Picture picture = new Picture();
        picture.load("resources/flow-free-04.png");
        picture.translate(10, 10);
        picture.draw();
    }
}
