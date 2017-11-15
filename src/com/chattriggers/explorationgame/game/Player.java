package com.chattriggers.explorationgame.game;

import com.chattriggers.explorationgame.ExplorationGame;
import com.chattriggers.explorationgame.utils.Camera;
import com.chattriggers.explorationgame.utils.SketchClass;
import lombok.Getter;
import processing.event.KeyEvent;

public class Player extends SketchClass {
    @Getter
    private float x;
    @Getter
    private float y;

    private float xMovement;
    private float yMovement;
    private float xSpeed;
    private float ySpeed;

    private Camera camera;

    public Player(float x, float y) {
        this.x = x;
        this.y = y;
        this.camera = ExplorationGame.getCamera();

        this.xMovement = 0;
        this.yMovement = 0;
        this.xSpeed = 0;
        this.ySpeed = 0;
    }

    public void update() {
        this.xSpeed = this.xMovement * 10;
        this.ySpeed = this.yMovement * 10;

        this.x += this.xSpeed;
        this.y += this.ySpeed;
    }

    public void draw() {
        game.ellipse(this.x - camera.getX(), this.y - camera.getY(), 10, 10);
    }

    public void keyPressed(KeyEvent event) {
        switch (event.getKey()) {
            case('w'):
                this.yMovement = -1;
                break;
            case('a'):
                this.xMovement = -1;
                break;
            case('s'):
                this.yMovement = 1;
                break;
            case('d'):
                this.xMovement = 1;
                break;
        }
    }

    public void keyReleased(KeyEvent event) {
        switch (event.getKey()) {
            case('w'):
            case('s'):
                this.yMovement = 0;
                break;
            case('a'):
            case('d'):
                this.xMovement = 0;

        }
    }
}
