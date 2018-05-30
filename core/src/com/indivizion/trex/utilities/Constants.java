package com.indivizion.trex.utilities;

import com.badlogic.gdx.math.Vector2;

import java.awt.Color;

public class Constants {
    public static final String TEXTURE_ATLAS = "images/trex.pack.atlas";

    public static final Vector2 WORLD_SIZE = new Vector2(600, 150);

    public static final Color BACKGROUND_COLOR = new Color(247/255f,247/255f, 247/255f, 1);

    public static final String DINO_WAITING = "dino-waiting";
    public static final String DINO_STANDING = "dino-standing";
    public static final String DINO_RUNNING_1 = "dino-waiting";
    public static final String DINO_RUNNING_2 = "dino-waiting";
    public static final String DINO_DUCKING_1 = "dino-waiting";
    public static final String DINO_DUCKING_2 = "dino-waiting";
    public static final String DINO_CRASHED = "dino-waiting";

    public static final float TREX_RUNNING_LOOP_DURATION = 0.5f;
    public static final float TREX_DROP_VELOCITY = -5;
    public static final float TREX_GRAVITY = 0.6f;
    public static final float TREX_HEIGHT_DUCK = 25;
    public static final float TREX_INIITAL_JUMP_VELOCITY = -10;
    public static final float TREX_INTRO_DURATION = 1500;
    public static final float TREX_MAX_JUMP_HEIGHT = 30;
    public static final float TREX_MIN_JUMP_HEIGHT = 30;
    public static final float TREX_SPEED_DROP_COEFFICIENT = 3;
    public static final float TREX_SPRITE_WIDTH = 262;
    public static final float TREX_START_X_POS = 50;
    public static final float TREX_WIDTH_DUCK = 59;

}

