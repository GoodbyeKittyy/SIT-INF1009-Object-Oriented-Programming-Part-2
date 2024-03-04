package com.mygdx.game_engine;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Scene {
    private Texture backgroundTexture;

    public Scene(String backgroundImagePath) {
        backgroundTexture = new Texture(backgroundImagePath);
    }

    public void renderBackground(SpriteBatch batch) {
        batch.draw(backgroundTexture, 0, 0); // Assuming the background fills the whole screen
    }

    public void dispose() {
    }

    // Add other scene-related methods here
}
