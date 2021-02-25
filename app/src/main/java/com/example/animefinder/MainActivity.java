package com.example.animefinder;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.eva).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this,
                    InfoActivity.class
            ));
        });
        findViewById(R.id.eva_2).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this,
                    InfoActivity.class
            ));
        });
        findViewById(R.id.anime_3).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this,
                    InfoActivity.class
            ));
        });
        findViewById(R.id.toSearchActivity).setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this,
                    SearchActivity.class
            ));
        });
    }
}