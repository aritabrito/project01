package org.academiadecodigo.hexallents.gameEngine;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Menu implements KeyboardHandler {
    private Picture picture;
    private Keyboard myKeyboard;

    public Menu(){
        myKeyboard = new Keyboard(this);
        keyEvents();
        showImage();
    }

    public void keyEvents() {
        KeyboardEvent sKEY = new KeyboardEvent();
        sKEY.setKey(KeyboardEvent.KEY_S);
        sKEY.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        myKeyboard.addEventListener(sKEY);

    }


    public void showImage(){
        picture = new Picture();
        picture.load("resources/flow-free-01.png");
        picture.translate(10, 10);
        picture.draw();
    }

    public void hideImage() {
        picture.delete();
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if(keyboardEvent.getKey() == KeyboardEvent.KEY_S){
            hideImage();
            Game.setGameState(GameState.INGAME);
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
