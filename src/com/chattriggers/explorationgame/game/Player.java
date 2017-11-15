package com.chattriggers.explorationgame.game;

import com.chattriggers.explorationgame.ExplorationGame;
import com.chattriggers.explorationgame.utils.Camera;
import com.chattriggers.explorationgame.utils.SketchClass;
import lombok.Getter;

public class Player extends SketchClass {
    @Getter
    private float x;
    @Getter
    private float y;

    private Camera camera;

    public Player(float x, float y) {
        this.x = x;
        this.y = y;
        this.camera = ExplorationGame.getCamera();
    }

    public void draw() {
        game.ellipse(this.x - camera.getX(), this.y - camera.getY(), 10, 10);
    }
}
