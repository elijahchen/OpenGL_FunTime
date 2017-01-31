package com.elijahcodes.opengl_funtime;

import android.content.Context;
import android.graphics.Point;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

import static android.R.attr.x;
import static android.R.attr.y;

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

    public boolean onTouchEvent(MotionEvent event) {
        Point size = new Point();
//        activity.getWindowManager().getDefaultDisplay().getSize(size);
        int width = size.x / 2;
        int height = size.y / 3;
        int playableArea = size.y - height;
    }
}
