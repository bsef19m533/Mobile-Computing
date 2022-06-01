package com.example.mc_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class Quiz extends AppCompatActivity {
    Button btn_sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        btn_sub = findViewById(R.id.button4);
    }

    public void load(){
        ImageView imageView = findViewById(R.id.imageView2);
        RadioButton option1 = findViewById(R.id.radioButton);
        RadioButton option2 = findViewById(R.id.radioButton2);
        RadioButton option3 = findViewById(R.id.radioButton3);

        String uri = "@drawable/s";

    }

}