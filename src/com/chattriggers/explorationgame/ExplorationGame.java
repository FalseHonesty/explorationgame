package com.chattriggers.explorationgame;

import com.chattriggers.explorationgame.game.Player;
import com.chattriggers.explorationgame.utils.Camera;
import lombok.Getter;
import processing.core.PApplet;

public class ExplorationGame extends PApplet {
    @Getter
    private static ExplorationGame explorationGame;

    //TODO: move to handler
    @Getter
    private static Player player;
    @Getter
    private static Camera camera;

    @Override
    public void settings() {
        size(camera.getWidth(), camera.getHeight());
    }

    @Override
    public void draw() {
        background(64);

        //TODO: move to handler
        camera.update();
        player.draw();
    }

    @Override
    public void mousePressed() {

    }

    public static void main(String[] args) {
        String[] processingArgs = {"ExplorationGame"};
        explorationGame = new ExplorationGame();

        //TODO: move to handler
        camera = new Camera(0, 0, 500, 500);
        player = new Player(250, 250);

        PApplet.runSketch(processingArgs, explorationGame);
    }


}
