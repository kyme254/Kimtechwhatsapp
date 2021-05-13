package com.kimtech.kimtechwhatsapp;

import android.content.Intent;
import android.os.Handler;


import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {
private TextView RL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //Create an intent that will start the main activity.
                Intent mainIntent = new Intent(WelcomeActivity.this, MainActivity.class);
                WelcomeActivity.this.startActivity(mainIntent);

                //Finish splash activity so user cant go back to it.
                WelcomeActivity.this.finish();

                //Apply splash exit (fade out) and main entry (fade in) animation transitions.
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        }, 3000);
    }
}
