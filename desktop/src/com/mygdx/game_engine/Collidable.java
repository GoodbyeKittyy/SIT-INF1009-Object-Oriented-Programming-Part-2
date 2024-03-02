package com.mygdx.game_engine;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game_layer.ControlledEntity;

public class Collidable implements ControlledEntity {

    @Override
    public void render(ShapeRenderer shapeRenderer) {
        // This method will render the Collidable object
    }

    @Override
    public void onCollisionDetected() {
        System.out.println("Collision Detected!");
        // You can add more logic here to handle collision events
    }
}
