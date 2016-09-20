package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DownloadSongs extends AppCompatActivity {
    int play = 0; // initially song is paused

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_songs);
        Button downloadSong = (Button) findViewById(R.id.download);
        downloadSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DownloadSongs.this, "Song downloaded to device", Toast.LENGTH_SHORT).show();
            }
        });
        final Button playPause = (Button) findViewById(R.id.playPause);
        playPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (play == 0) {
                    Toast.makeText(DownloadSongs.this, "Play", Toast.LENGTH_SHORT).show();
                    play = 1;
                    playPause.setBackgroundResource(R.drawable.pause);
                } else {
                    Toast.makeText(DownloadSongs.this, "Pause", Toast.LENGTH_SHORT).show();
                    play = 0;
                    playPause.setBackgroundResource(R.drawable.play);
                }
            }
        });
    }
}
