package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class BuySong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_song);
    }

    public void buySong(View v) {
        Toast.makeText(this, "Song bought download now", Toast.LENGTH_SHORT).show();
        Intent downloadSong = new Intent(BuySong.this, DownloadSongs.class);
        startActivity(downloadSong);
    }
}
