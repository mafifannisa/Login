package com.subayu.studio.login;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;

public class Sukses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukses);

        final KonfettiView konfettiView = (KonfettiView)findViewById(R.id.konfettiView);
                konfettiView.build()
                        .addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA,Color.BLUE,Color.CYAN,Color.DKGRAY)
                        .setDirection(0.0, 359.0)
                        .setSpeed(1f, 10f)
                        .setFadeOutEnabled(true)
                        .setTimeToLive(10000L)
                        .addShapes(Shape.RECT, Shape.CIRCLE)
                        .addSizes(new Size(12, 5f))
                        .setPosition(-50f, konfettiView.getWidth() + 50f, -50f, -50f)
                        .stream(1300, 10000L);
    }
}
