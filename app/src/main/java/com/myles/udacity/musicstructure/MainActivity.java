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
                Intent favoriteIntent = new Intent(MainActivity.this, FavoriteActivity.class);
                startActivity(favoriteIntent);
                Log.v("MainActivity","Invoke favorite activity");
            }
        });

        findViewById(R.id.button_download).setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent downloadIntent = new Intent(MainActivity.this, DownloadActivity.class);
                startActivity(downloadIntent);
                Log.v("MainActivity","Invoke download activity");
            }
        });
    }
}
