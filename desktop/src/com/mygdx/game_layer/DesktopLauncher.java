// DesktopLauncher.java
package com.mygdx.game_layer;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.mygdx.game_engine.GameManager;

public class DesktopLauncher {
    public static void main(String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setForegroundFPS(60);
        config.setTitle("OOP PART 1 DELIVERABLE - P6 TEAM 2");

        GameManager gameManager = new GameManager();
        new Lwjgl3Application(gameManager, config);
    }
}
