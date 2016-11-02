package com.myles.udacity.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_favorite).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FavoriteActivity.class));
                Log.v("MainActivity","Invoke favorite activity");
            }
        });

        findViewById(R.id.button_download).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DownloadActivity.class));
                Log.v("MainActivity","Invoke download activity");
            }
        });

        findViewById(R.id.button_mymusic).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MyMusicActivity.class));
                Log.v("MainActivity","Invoke mymusic activity");
            }
        });

        findViewById(R.id.button_scan).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ScanActivity.class));
                Log.v("MainActivity","Invoke scan activity");
            }
        });

        findViewById(R.id.panel_nowplaying).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NowPlayingActivity.class));
                Log.v("MainActivity","Invoke now playing activity");
            }
        });
    }
}
