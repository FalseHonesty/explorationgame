package com.chattriggers.explorationgame.game;

import com.chattriggers.explorationgame.utils.SketchClass;
import lombok.Getter;

public class Player extends SketchClass {
    @Getter
    private float x;
    @Getter
    private float y;

    public Player(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        game.ellipse(this.x, this.y, 10, 10);
    }
}
