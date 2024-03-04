package com.mygdx.game_engine;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game_layer.PlayerControlManager;

public class GameManager extends Game {

    private PlayerControlManager playerControlManager;
    private AIControlManager aiControlManager;
    private EntityManager entityManager;
    private SceneManager sceneManager;
    private InputOutputManager inputOutputManager;
    private SpriteBatch batch;
    private Music music;

    @Override
    public void create() {
        batch = new SpriteBatch();
        inputOutputManager = new InputOutputManager();
        playerControlManager = new PlayerControlManager(inputOutputManager);
        aiControlManager = new AIControlManager();
        entityManager = new EntityManager();
        sceneManager = new SceneManager();

        // Initialize the start scene and add it to the scene manager
        StartScene startScene = new StartScene();
        sceneManager.addScene(startScene);
        sceneManager.setCurrentScene(startScene);

        // Load and play music
        music = Gdx.audio.newMusic(Gdx.files.internal("Music/Hey Kids Remake.WAV"));
        music.setLooping(true);
        music.play();

        // Set up input processor to listen for touch input
        Gdx.input.setInputProcessor(new InputAdapter() {
            @Override
            public boolean touchUp(int screenX, int screenY, int pointer, int button) {
                // Switch to the MountainScene on any touch/click release
                sceneManager.setCurrentScene(new MountainScene());
                return true; // Return true to indicate the event was handled
            }
        });
    }

    @Override
    public void render() {
        super.render();
        // Render the current scene
        batch.begin();
        Scene currentScene = sceneManager.getCurrentScene();
        if (currentScene != null) {
            currentScene.renderBackground(batch);
        }
        batch.end();
    }

    @Override
    public void dispose() {
        if (sceneManager.getCurrentScene() != null) {
            sceneManager.getCurrentScene().dispose();
        }
        batch.dispose();
        music.dispose();
    }

    // Getter for SceneManager for potential external use
    public SceneManager getSceneManager() {
        return sceneManager;
    }
}
