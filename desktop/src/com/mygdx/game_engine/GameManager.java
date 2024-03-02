package com.mygdx.game_engine;

import com.badlogic.gdx.Game;
import com.mygdx.game_layer.PlayerControlManager;

public class GameManager extends Game {

    private PlayerControlManager playerControlManager;
    private AIControlManager aiControlManager;
    private EntityManager entityManager;
    private SceneManager sceneManager;
    private InputOutputManager inputOutputManager;

    @Override
    public void create() {
        // Initialize your game here
        inputOutputManager = new InputOutputManager();
        playerControlManager = new PlayerControlManager(inputOutputManager); // Passing InputOutputManager instance to PlayerControlManager
        aiControlManager = new AIControlManager();
        entityManager = new EntityManager();
        sceneManager = new SceneManager(); // Now SceneManager is instantiated within GameManager
        sceneManager.init(); // Initialize SceneManager without passing GameManager reference
    }

    @Override
    public void render() {
        super.render();
        // Update and render your game here
    }

    // Getter method for SceneManager
    public SceneManager getSceneManager() {
        return sceneManager;
    }
}
