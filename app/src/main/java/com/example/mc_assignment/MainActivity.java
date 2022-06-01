package com.example.mc_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button alpha, quiz, link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alpha = (Button)findViewById(R.id.button);
        quiz = (Button)findViewById(R.id.button2);
        link = (Button)findViewById(R.id.button3);
        alpha.setOnClickListener(this);
        quiz.setOnClickListener(this);
        link.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button2:
                Intent intent1 = new Intent(MainActivity.this,Alphabetlesson.class);
                startActivity(intent1);
                break;
            case R.id.button3:
                Intent intent2 = new Intent(MainActivity.this,Alphabetlesson.class);
                startActivity(intent2);
            case R.id.button:
                Uri webpage = Uri.parse("https://github.com/bsef19m533/Mobile-Computing");
                Intent intent3 = new Intent(Intent.ACTION_VIEW,webpage);
                startActivity(intent3);
                break;
        }
    }
}