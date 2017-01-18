package com.elijahcodes.opengl_funtime;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by Elijah on 1/17/2017.
 */

public class GameView extends GLSurfaceView{
    private final GameRenderer gameRenderer;

    public GameView(Context context) {
        super(context);

        setEGLContextClientVersion(2);

        gameRenderer = new GameRenderer(context);

        setRenderer(gameRenderer);
    }
}
