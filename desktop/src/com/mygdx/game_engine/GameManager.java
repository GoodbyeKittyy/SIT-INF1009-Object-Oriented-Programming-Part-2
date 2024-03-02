package com.mygdx.game_engine;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game_layer.PlayerControlManager;

public class GameManager extends Game {

    private PlayerControlManager playerControlManager;
    private AIControlManager aiControlManager;
    private EntityManager entityManager;
    private SceneManager sceneManager;
    private InputOutputManager inputOutputManager;
    private SpriteBatch batch;
    private Texture backgroundTexture;
    private Music music; // Declare Music object

    @Override
    public void create() {
        // Initialize your game here
        inputOutputManager = new InputOutputManager();
        playerControlManager = new PlayerControlManager(inputOutputManager); // Passing InputOutputManager instance to PlayerControlManager
        aiControlManager = new AIControlManager();
        entityManager = new EntityManager();
        sceneManager = new SceneManager(); // Now SceneManager is instantiated within GameManager
        batch = new SpriteBatch();
        backgroundTexture = new Texture("Scenes/ArchaeoQuestWorlds_Logo.png");

        // Load music file
        music = Gdx.audio.newMusic(Gdx.files.internal("Music/Hey Kids Remake.WAV"));
        music.setLooping(true); // Set music to loop
        music.play(); // Play the music
    }

    @Override
    public void render() {
        super.render();
        // Update and render your game here
        batch.begin();
        batch.draw(backgroundTexture, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        backgroundTexture.dispose();
        music.dispose(); // Dispose of music when no longer needed
    }

    // Getter method for SceneManager
    public SceneManager getSceneManager() {
        return sceneManager;
    }
}
