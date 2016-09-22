package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    int play = 0; //initially song is paused
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
        LinearLayout playSong1 = (LinearLayout) findViewById(R.id.PlaySong1);
        LinearLayout playSong2 = (LinearLayout) findViewById(R.id.PlaySong2);
        LinearLayout playSong3 = (LinearLayout) findViewById(R.id.PlaySong3);
        LinearLayout playSong4 = (LinearLayout) findViewById(R.id.PlaySong4);
        playSong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSong();
            }
        });
        playSong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSong();
            }
        });
        playSong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSong();
            }
        });
        playSong4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSong();
            }
        });
        LinearLayout footer = (LinearLayout) findViewById(R.id.footer);
        footer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent currentSong = new Intent(MainActivity.this, CurrentSong.class);
                startActivity(currentSong);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.buySongs) {
            Intent buySong = new Intent(MainActivity.this, BuySong.class);
            startActivity(buySong);
        }

        return super.onOptionsItemSelected(item);
    }

    private void playSong() {
        Intent currentSong = new Intent(MainActivity.this, CurrentSong.class);
        startActivity(currentSong);
    }
}
