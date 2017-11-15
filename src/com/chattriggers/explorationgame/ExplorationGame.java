package com.chattriggers.explorationgame;

import com.chattriggers.explorationgame.game.Player;
import lombok.Getter;
import processing.core.PApplet;

public class ExplorationGame extends PApplet {
    @Getter
    private static ExplorationGame explorationGame;

    //TODO: move to handler
    @Getter
    private static Player player;

    @Override
    public void settings() {
        size(500, 500);
    }

    @Override
    public void draw() {
        background(64);

        //TODO: move to handler
        player.draw();
    }

    @Override
    public void mousePressed() {

    }

    public static void main(String[] args) {
        String[] processingArgs = {"ExplorationGame"};
        explorationGame = new ExplorationGame();

        //TODO: move to handler
        player = new Player(250, 250);

        PApplet.runSketch(processingArgs, explorationGame);
    }


}
