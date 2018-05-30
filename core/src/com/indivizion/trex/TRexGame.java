package com.indivizion.trex;

import com.badlogic.gdx.Game;

public class TRexGame extends Game {

		@Override
		public void create() {
			setScreen(new GameplayScreen());
		}
}
