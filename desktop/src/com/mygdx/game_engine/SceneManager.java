package com.mygdx.game_engine;

import java.util.ArrayList;
import java.util.List;

public class SceneManager {
    private List<Scene> scenes; // SceneManager aggregates Scene(s)
    private Scene currentScene; // Keep track of the current scene

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
        if (scenes.size() == 1) { // If this is the first scene added, set it as the current scene
            currentScene = scene;
        }
    }

    // Method to set the current scene
    public void setCurrentScene(Scene scene) {
        currentScene = scene;
    }

    // Method to get the current scene
    public Scene getCurrentScene() {
        return currentScene;
    }

    // Other methods related to scene management can be added here
}
