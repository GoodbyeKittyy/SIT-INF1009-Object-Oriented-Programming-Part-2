package com.mygdx.game_engine;

import java.util.ArrayList;
import java.util.List;

import com.mygdx.game_layer.TexturedObject;

public class InputOutputManager {
    private List<TexturedObject> texturedObjects;

    public InputOutputManager() {
        texturedObjects = new ArrayList<>();
    }

    // Method to add TexturedObject to the list
    public void addTexturedObject(TexturedObject texturedObject) {
        texturedObjects.add(texturedObject);
    }

    // Method to remove TexturedObject from the list
    public void removeTexturedObject(TexturedObject texturedObject) {
        texturedObjects.remove(texturedObject);
    }

    // Other methods related to InputOutputManager
}
