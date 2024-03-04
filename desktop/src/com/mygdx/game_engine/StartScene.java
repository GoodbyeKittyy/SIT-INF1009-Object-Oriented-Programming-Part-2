package com.mygdx.game_engine;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class StartScene extends Scene {

    public StartScene() {
        super("Scenes/ArchaeoQuestWorlds_Logo.png");
    }

    @Override
    public void renderBackground(SpriteBatch batch) {
        super.renderBackground(batch);
        // You can add more rendering logic specific to the start scene here
    }

    // Add other methods specific to the start scene if necessary
}
