package com.chattriggers.explorationgame.utils;

import com.chattriggers.explorationgame.ExplorationGame;
import lombok.Getter;

public class Camera {
    @Getter
    private float x;
    @Getter
    private float y;
    @Getter
    private int width;
    @Getter
    private int height;

    public Camera(float x, float y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void update() {
        this.x = easeOut(this.x, ExplorationGame.getPlayer().getX() - this.width / 2);
        this.y = easeOut(this.y, ExplorationGame.getPlayer().getY() - this.height / 2);
    }

    private float easeOut(float from, float to) {
        if (Math.floor(Math.abs(to - from) / 0.1) > 0) {
            return from + (to - from) / 10;
        } else {
            return to;
        }
    }
}
