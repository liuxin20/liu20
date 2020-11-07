package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;



public class FirstActivity extends AppCompatActivity {

    private final static String TAG="FirstActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"msg");
        setContentView(R.layout.first_layout);

        Button button1 = findViewById(R.id.Button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.tfswufe.edu.cn/"));
                startActivity(intent);*/

               /*Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
               startActivityForResult(intent,1);*/

               Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
               Bundle bundle = new Bundle();
               Message msg = new Message("张三","M",20);
               bundle.putParcelable("msg",msg);
               intent.putExtra("message",bundle);
               startActivity(intent);


            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1)
        {
            if(resultCode == RESULT_OK)
            {
                String msg = data.getStringExtra("msg");
                Log.d(TAG,"msg=" + msg);
            }
        }
    }
}
