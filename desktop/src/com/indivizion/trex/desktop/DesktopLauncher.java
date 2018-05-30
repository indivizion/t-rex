package com.indivizion.trex.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.indivizion.trex.TRexGame;
import com.indivizion.trex.utilities.Constants;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = (int)Constants.WORLD_SIZE.x;
		config.height = (int)Constants.WORLD_SIZE.y;
		new LwjglApplication(new TRexGame(), config);
	}
}
