package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    int play = 0; //initially song is paused
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button playPause = (Button) findViewById(R.id.playPause);
        playPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (play == 0){
                    playPause.setBackgroundResource(R.drawable.pause);
                    play = 1;
                }
                else {
                    playPause.setBackgroundResource(R.drawable.play);
                    play=0;
                }
            }
        });
        LinearLayout footer = (LinearLayout) findViewById(R.id.footer);
        footer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent currentSong = new Intent(MainActivity.this, currentSong.class);
                startActivity(currentSong);
            }
        });
    }
    public void playSong(View v){
        Intent currentSong = new Intent(MainActivity.this, currentSong.class);
        startActivity(currentSong);
    }
}
