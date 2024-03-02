package com.mygdx.game_layer;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public interface ControlledEntity {

    void render(ShapeRenderer shapeRenderer);

    void onCollisionDetected();
}
