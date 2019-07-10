package com.example.emily;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        progressBar.setMax(100);
        progressBar.setScaleY(3f);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        RelativeLayout relativeLayout = findViewById(R.id.relativelayout);
        AnimationDrawable animationDrawable = (AnimationDrawable) relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setEnterFadeDuration(4000);
        animationDrawable.start();

        TextView textView = findViewById(R.id.textView);
        Typeface myCustomfont = Typeface.createFromAsset(getAssets(),"assets/NanumBarunpenR.otf");
        textView.setTypeface(myCustomfont);



    }

    public void progressAnimation(){
        loading anim = new loading(this, progressBar, 0f, 100f);
        anim.setDuration(8000);
        progressBar.setAnimation(anim);
    }
}
