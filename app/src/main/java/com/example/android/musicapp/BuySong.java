package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BuySong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_song);
        Button buySong1 = (Button) findViewById(R.id.BuySong1);
        Button buySong2 = (Button) findViewById(R.id.BuySong2);
        Button buySong3 = (Button) findViewById(R.id.BuySong3);
        Button buySong4 = (Button) findViewById(R.id.BuySong4);
        Button buySong5 = (Button) findViewById(R.id.BuySong5);
        Button buySong6 = (Button) findViewById(R.id.BuySong6);
        buySong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BuySong();
            }
        });
        buySong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BuySong();
            }
        });
        buySong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BuySong();
            }
        });
        buySong4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BuySong();
            }
        });
        buySong5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BuySong();
            }
        });
        buySong6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BuySong();
            }
        });
    }

    private void BuySong() {
        Toast.makeText(this, "Song Bought, Download from next screen", Toast.LENGTH_SHORT).show();
        Intent downloadSong = new Intent(BuySong.this, DownloadSongs.class);
        startActivity(downloadSong);
    }

}
