package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CurrentSong extends AppCompatActivity {
    int play = 1; //initially song is playing

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_song);
        final Button playPause = (Button) findViewById(R.id.playPause);
        Button next = (Button) findViewById(R.id.next);
        Button previous = (Button) findViewById(R.id.previous);
        final Button shuffleOff = (Button) findViewById(R.id.shuffle);
        final Button shuffleOn = (Button) findViewById(R.id.shuffleOn);
        final Button repeatOff = (Button) findViewById(R.id.repeat);
        final Button repeatOn = (Button) findViewById(R.id.repeatOn);
        playPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (play == 1) {
                    playPause.setBackgroundResource(R.drawable.play);
                    play = 0;
                } else {
                    playPause.setBackgroundResource(R.drawable.pause);
                    play = 1;
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CurrentSong.this, "Next song", Toast.LENGTH_SHORT).show();
            }
        });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CurrentSong.this, "Previous song", Toast.LENGTH_SHORT).show();
            }
        });
        shuffleOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shuffleOn.setVisibility(View.VISIBLE);
                shuffleOff.setVisibility(View.GONE);
            }
        });
        shuffleOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shuffleOn.setVisibility(View.GONE);
                shuffleOff.setVisibility(View.VISIBLE);
            }
        });
        repeatOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                repeatOn.setVisibility(View.VISIBLE);
                repeatOff.setVisibility(View.GONE);
            }
        });
        repeatOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                repeatOn.setVisibility(View.GONE);
                repeatOff.setVisibility(View.VISIBLE);
            }
        });
    }
}
