package com.example.baker.myfavouritesong;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AboutActivity extends AppCompatActivity {

    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        actionBar=getSupportActionBar();
        actionBar.setTitle("About");
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5B92E5")));
    }
}
