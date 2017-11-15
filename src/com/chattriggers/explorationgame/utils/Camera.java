package com.chattriggers.explorationgame.utils;

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

    }
}
