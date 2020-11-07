package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private final static String TAG="SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        Intent i =getIntent();
        Bundle bundle = i.getBundleExtra("message");
        if(bundle != null)
        {
            Message msg = (Message) bundle .get("msg");
            Log.d(TAG,"msg=" + msg);
        }

        Button button = findViewById(R.id.Button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("msg","data from SecondActivity");
                setResult(RESULT_OK);
                finish();
            }
        });

    }
}
