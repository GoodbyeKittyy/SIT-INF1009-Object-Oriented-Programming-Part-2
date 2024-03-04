package com.mygdx.game_engine;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MountainScene extends Scene {

    public MountainScene() {
        super("Scenes/Rocky Mountain.png");
    }

    @Override
    public void renderBackground(SpriteBatch batch) {
        super.renderBackground(batch);
        // You can add more rendering logic specific to the mountain scene here
    }

    // Add other methods specific to the mountain scene if necessary
}
