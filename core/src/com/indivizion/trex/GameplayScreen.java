package com.indivizion.trex;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.indivizion.trex.utilities.Assets;
import com.indivizion.trex.utilities.Constants;
import com.indivizion.trex.utilities.Utils;

public class GameplayScreen extends ScreenAdapter {

    SpriteBatch batch;
    public Viewport viewport;

    long startTime;

    @Override
    public void show() {
        super.show();
        AssetManager manager = new AssetManager();
        Assets.instance.init(manager);
        viewport = new ExtendViewport(Constants.WORLD_SIZE.x, Constants.WORLD_SIZE.y);
        batch = new SpriteBatch();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        Gdx.gl.glClearColor(Constants.BACKGROUND_COLOR.getRed(),
                Constants.BACKGROUND_COLOR.getGreen(),
                Constants.BACKGROUND_COLOR.getBlue(),
                Constants.BACKGROUND_COLOR.getAlpha());
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        viewport.apply();
        batch.setProjectionMatrix(viewport.getCamera().combined);

        batch.begin();
        Utils.drawTextureRegion(batch, Assets.instance.dinoAssets.wainting, 10, 30);
        batch.end();
    }

    @Override
    public void hide() {
        super.hide();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

    @Override
    public void dispose() {
        Assets.instance.dispose();
        batch.dispose();
    }
}
