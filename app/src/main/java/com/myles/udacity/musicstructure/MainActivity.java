package com.myles.udacity.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mFavoriteButton = (Button)findViewById(R.id.button_favorite);
        mFavoriteButton.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent favoriteIntent = new Intent(MainActivity.this, FavoriteActivity.class);

                // Start the new activity
                startActivity(favoriteIntent);
            }
        });
    }
}
