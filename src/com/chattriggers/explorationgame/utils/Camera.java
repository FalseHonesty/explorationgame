package com.chattriggers.explorationgame.utils;

import lombok.Getter;

public class Camera {
    @Getter
    private float x;
    @Getter
    private float y;
    @Getter
    private float z;

    public Camera(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
