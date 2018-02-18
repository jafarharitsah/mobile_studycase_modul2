package com.example.android.jafar_1202150057_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by Jafar on 16/02/2018.
 */

public class SplashScreenActivity extends AppCompatActivity{

    ImageView imageView_EAD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView_EAD = findViewById(R.id.imageView);
        imageView_EAD.setImageResource(R.drawable.logoead);

         new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashScreenActivity.this, MenuUtamaActivity.class);
                SplashScreenActivity.this.startActivity(mainIntent);
                SplashScreenActivity.this.finish();
            }
        }, 3000);
    }
}
