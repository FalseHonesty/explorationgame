package com.chattriggers.explorationgame;

import lombok.Getter;
import processing.core.PApplet;

public class ExplorationGame extends PApplet {
    @Getter
    private static ExplorationGame explorationGame;

    @Override
    public void settings() {
        size(500, 500);
    }

    @Override
    public void draw() {
        ellipse(mouseX, mouseY, 50, 50);
    }

    @Override
    public void mousePressed() {
        background(64);
    }

    public static void main(String[] args) {
        String[] processingArgs = {"ExplorationGame"};

        explorationGame = new ExplorationGame();
        PApplet.runSketch(processingArgs, explorationGame);
    }
}
