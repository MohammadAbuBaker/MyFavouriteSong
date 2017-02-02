package com.example.baker.myfavouritesong;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SongDetails extends AppCompatActivity {
    TextView txtSongFullName;
    Button btnPlay,btnPause,btnStop;
    MediaPlayer player1,player2,player3,player4;
    boolean playing=false;
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_details);

        actionBar=getSupportActionBar();
        actionBar.setTitle("Song Details");
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5B92E5")));


        txtSongFullName=(TextView)findViewById(R.id.txtSongFullName);
        btnPlay=(Button)findViewById(R.id.btnPlay);
        btnPause=(Button)findViewById(R.id.btnPause);
        btnStop=(Button)findViewById(R.id.btnStop);

        player1=MediaPlayer.create(SongDetails.this,R.raw.o_paki_tor);
        player2=MediaPlayer.create(SongDetails.this,R.raw.khairon_lo);
        player3=MediaPlayer.create(SongDetails.this,R.raw.son_raha);
        player4=MediaPlayer.create(SongDetails.this,R.raw.big_battery_add);

         /*SongName activity theke j id ta patano hoise ,aikane seita getExtras dia string variable raka hoise*/
        String getSongName=getIntent().getExtras().getString("songName");

        if(getSongName.equals("OPakiTor")){
            txtSongFullName.setText("O Phaki Tor Jontro Na");//setText dia text gula id te set kore dewa hoi
            btnPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(!playing){
                        player1.start();
                        // player.setLooping(true);// jodi audio ta ses howar pro nije nije chalte thakr dorkar
                        playing=true;
                    }

                }
            });
            btnPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(playing){
                        player1.pause();
                        playing=false;
                    }
                }
            });
            btnStop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(playing){
                        player1.stop();
                        playing=false;

                    }
                    SongDetails.this.finish();//for exit from app

                }
            });

        }

        else  if(getSongName.equals("KhaironLo")){
            txtSongFullName.setText("Khairon Lo Tor Lomba Mathar.");//setText dia text gula id te set kore dewa hoi
            btnPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(!playing){
                        player2.start();
                        // player.setLooping(true);// jodi audio ta ses howar pro nije nije chalte thakr dorkar
                        playing=true;
                    }

                }
            });
            btnPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(playing){
                        player2.pause();
                        playing=false;
                    }
                }
            });
            btnStop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(playing){
                        player2.stop();
                        playing=false;

                    }
                    SongDetails.this.finish();//for exit from app
                }
            });

        }

        else  if(getSongName.equals("SunRahaNaTo")){
            txtSongFullName.setText("Sun Rah Ha Na To");//setText dia text gula id te set kore dewa hoi
            btnPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(!playing){
                        player3.start();
                        // player.setLooping(true);// jodi audio ta ses howar pro nije nije chalte thakr dorkar
                        playing=true;
                    }

                }
            });
            btnPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(playing){
                        player3.pause();
                        playing=false;
                    }
                }
            });
            btnStop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(playing){
                        player3.stop();
                        playing=false;

                    }
                    SongDetails.this.finish();//for exit from app
                }
            });

        }

        else  if(getSongName.equals("BigBattery")){
            txtSongFullName.setText("King Star Big Battery");//setText dia text gula id te set kore dewa hoi
            btnPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(!playing){
                        player4.start();
                        // player.setLooping(true);// jodi audio ta ses howar pro nije nije chalte thakr dorkar
                        playing=true;
                    }

                }
            });
            btnPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(playing){
                        player4.pause();
                        playing=false;
                    }
                }
            });
            btnStop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(playing){
                        player4.stop();
                        playing=false;

                    }
                    SongDetails.this.finish();//for exit from app
                }
            });

        }
    }
}
