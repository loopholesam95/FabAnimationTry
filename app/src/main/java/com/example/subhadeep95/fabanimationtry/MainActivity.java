package com.example.subhadeep95.fabanimationtry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Animation animRotate = AnimationUtils.loadAnimation(this,R.anim.anim_rotate);
        final Animation animAlpha = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        final Animation animBlink = AnimationUtils.loadAnimation(this,R.anim.anim_blink);
        final Animation animFade = AnimationUtils.loadAnimation(this,R.anim.anim_fade);
        final Animation animClockwise = AnimationUtils.loadAnimation(this,R.anim.anim_clockwise);
        final Animation animSlide = AnimationUtils.loadAnimation(this,R.anim.anim_slide);

        Button btnRotate = (Button)findViewById(R.id.rotate);
        Button btnAlpha = (Button)findViewById(R.id.alpha);
        Button btnBlink = (Button)findViewById(R.id.blink);
        Button btnFade = (Button)findViewById(R.id.fade);
        Button btnClockwise = (Button)findViewById(R.id.clockwise);
        Button btnSlide = (Button)findViewById(R.id.slide);
        Button btnComplex = (Button)findViewById(R.id.complex);

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    v.startAnimation(animAlpha);
            }
        });
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animRotate);
            }
        });
        btnBlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animBlink);
            }
        });
        btnFade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animFade);
            }
        });
        btnClockwise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animClockwise);
            }
        });
        btnSlide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animSlide);
            }
        });
        btnComplex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationSet sets = new AnimationSet(false);
                sets.addAnimation(animAlpha);
                sets.addAnimation(animRotate);
                v.startAnimation(sets);

            }
        });
    }
}
