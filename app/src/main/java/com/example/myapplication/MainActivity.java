package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity", "onCreate enter");
        setContentView(R.layout.main_layout);


        Button normalBtn = findViewById(R.id.start_normal_activity);
        normalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,NormalActivity.class);
                startActivity(intent1);
            }
        });
        Button dialogBtn = findViewById(R.id.start_dialog_activity);
        dialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "onResume enter");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "onStop enter");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "onPause enter");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "onStart enter");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy enter");
    }

}
