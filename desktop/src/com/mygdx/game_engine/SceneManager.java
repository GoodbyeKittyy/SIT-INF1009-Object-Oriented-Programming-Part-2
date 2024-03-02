package com.mygdx.game_engine;

import java.util.ArrayList;
import java.util.List;

public class SceneManager {
    private List<Scene> scenes; // SceneManager aggregates Scene(s)

    public SceneManager() {
        scenes = new ArrayList<>();
    }

    // Method to initialize SceneManager
    public void init() {
        // Initialize SceneManager without needing GameManager reference
    }

    // Method to add scene to SceneManager
    public void addScene(Scene scene) {
        scenes.add(scene);
    }

    // Other methods related to scene management can be added here
}
