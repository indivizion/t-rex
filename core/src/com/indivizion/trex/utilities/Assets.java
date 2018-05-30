package com.indivizion.trex.utilities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetErrorListener;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Disposable;

public class Assets implements Disposable, AssetErrorListener {

    public static final String TAG = Assets.class.getName();
    public static final Assets instance = new Assets();

    public DinoAssets dinoAssets;

    private AssetManager assetManager;


    private Assets() {
    }

    public void init(AssetManager assetManager) {
        this.assetManager = assetManager;
        assetManager.setErrorListener(this);
        assetManager.load(Constants.TEXTURE_ATLAS, TextureAtlas.class);
        assetManager.finishLoading();

        TextureAtlas atlas = assetManager.get(Constants.TEXTURE_ATLAS);
        dinoAssets = new DinoAssets(atlas);
    }

    @Override
    public void error(AssetDescriptor asset, Throwable throwable) {
        Gdx.app.error(TAG, "Couldn't load asset: " + asset.fileName, throwable);
    }

    public void dispose() {
        assetManager.dispose();
    }

    public class DinoAssets {

        public final TextureAtlas.AtlasRegion standing;
        public final TextureAtlas.AtlasRegion wainting;
        public final TextureAtlas.AtlasRegion running;
        public final TextureAtlas.AtlasRegion ducking;
        public final TextureAtlas.AtlasRegion crashed;

        public final Animation runningAnimation;
        public final Animation duckingAnimation;


        public DinoAssets(TextureAtlas atlas) {
            wainting = atlas.findRegion(Constants.DINO_WAITING);
            standing = atlas.findRegion(Constants.DINO_STANDING);
            running = atlas.findRegion(Constants.DINO_RUNNING_1);
            ducking = atlas.findRegion(Constants.DINO_DUCKING_1);
            crashed = atlas.findRegion(Constants.DINO_CRASHED);

            Array<TextureAtlas.AtlasRegion> runningFrames = new Array<TextureAtlas.AtlasRegion>();
            runningFrames.add(atlas.findRegion(Constants.DINO_RUNNING_1));
            runningFrames.add(atlas.findRegion(Constants.DINO_RUNNING_2));
            runningAnimation = new Animation(Constants.TREX_RUNNING_LOOP_DURATION, runningFrames, Animation.PlayMode.LOOP);

            Array<TextureAtlas.AtlasRegion> duckingFrames = new Array<TextureAtlas.AtlasRegion>();
            duckingFrames.add(atlas.findRegion(Constants.DINO_DUCKING_1));
            duckingFrames.add(atlas.findRegion(Constants.DINO_DUCKING_2));
            duckingAnimation = new Animation(Constants.TREX_RUNNING_LOOP_DURATION, duckingFrames, Animation.PlayMode.LOOP);
        }
    }

}
