package com.elijahcodes.opengl_funtime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private GameView myGameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        myGameView = new GameView(this);
        setContentView(myGameView);
    }

    @Override
    protected void onPause() {
        super.onPause();
        // This call pauses the thread, if application is memory intensive consider de-allocation
        myGameView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // This call resumes the thread, if de-allocated will re-allocate
        myGameView.onResume();
    }
}
