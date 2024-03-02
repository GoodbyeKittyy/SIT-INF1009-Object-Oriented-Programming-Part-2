package com.mygdx.game_engine;

import com.mygdx.game_layer.TexturedObject;
import java.util.ArrayList;
import java.util.List;

public class Entities {
    private List<TexturedObject> texturedObjects;

    public Entities() {
        texturedObjects = new ArrayList<>();
    }

    public void addTexturedObject(TexturedObject texturedObject) {
        texturedObjects.add(texturedObject);
    }

    public void removeTexturedObject(TexturedObject texturedObject) {
        texturedObjects.remove(texturedObject);
    }

    // Other methods related to Entities

    // Example method to get all textured objects
    public List<TexturedObject> getTexturedObjects() {
        return texturedObjects;
    }
}
