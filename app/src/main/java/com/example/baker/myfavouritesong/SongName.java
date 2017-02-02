package com.example.baker.myfavouritesong;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SongName extends AppCompatActivity {

    Button btnOPakiTor,btnKhaironLo,btnSunRahaHa,btnBigBatteryAdd,btnAbout;
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_name);

        actionBar=getSupportActionBar();
        actionBar.setTitle("Song Name");
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5B92E5")));

        btnOPakiTor=(Button)findViewById(R.id.btnOPakiTor);
        btnKhaironLo=(Button)findViewById(R.id.btnKhaironLo);
        btnSunRahaHa=(Button)findViewById(R.id.btnSunRahaHa);
        btnBigBatteryAdd=(Button)findViewById(R.id.btnBigBatteryAdd);
        btnAbout=(Button)findViewById(R.id.btnAbout);

        btnOPakiTor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SongName.this,SongDetails.class);
                intent.putExtra("songName","OPakiTor");// aitar maddome id=songName and data=OPakiTor onno activity te patano hoise
                startActivity(intent);
                Toast.makeText(SongName.this, "Press Button O Paki Tor Jontro na", Toast.LENGTH_SHORT).show();
            }
        });

        btnKhaironLo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SongName.this,SongDetails.class);
                intent.putExtra("songName","KhaironLo");// aitar maddome id=songName and data=KhaironLo onno activity te patano hoise
                startActivity(intent);
                Toast.makeText(SongName.this, "Press Button Khairon Lo", Toast.LENGTH_SHORT).show();
            }
        });

        btnSunRahaHa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SongName.this,SongDetails.class);
                intent.putExtra("songName","SunRahaNaTo");// aitar maddome id=songName and data=SunRahaNaTo onno activity te patano hoise
                startActivity(intent);
                Toast.makeText(SongName.this, "Press Button Sun Raha Ha Na To", Toast.LENGTH_SHORT).show();
            }
        });

        btnBigBatteryAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SongName.this,SongDetails.class);
                intent.putExtra("songName","BigBattery");// aitar maddome id=songName and data=BigBattery onno activity te patano hoise
                startActivity(intent);
                Toast.makeText(SongName.this, "Press Button Big Battery Battery Advertise", Toast.LENGTH_SHORT).show();
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SongName.this,AboutActivity.class);
                 startActivity(intent);
                Toast.makeText(SongName.this, "Press About Button", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
