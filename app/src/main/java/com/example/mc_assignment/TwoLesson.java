package com.example.mc_assignment;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TwoLesson extends AppCompatActivity {
    String uri = null;
    ImageView imageView;
    TextView textView;
    String picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_lesson);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");

        switch (name) {
            case "A":
                uri = "@drawable/a";
                picture = "Apple";
                break;
            case "B":
                uri = "@drawable/b";
                picture = "Banana";
                break;
            case "C":
                uri = "@drawable/c";
                picture = "Car";
                break;
            case "D":
                uri = "@drawable/d";
                picture = "Dinosaur";
                break;
            case "E":
                uri = "@drawable/e";
                picture = "Elephant";
                break;
            case "F":
                uri = "@drawable/f";
                picture = "Fish";
                break;
            case "G":
                uri = "@drawable/g";
                picture = "Giraffe";
                break;
            case "H":
                uri = "@drawable/h";
                picture = "Hen";
                break;
            case "I":
                uri = "@drawable/i";
                picture = "Ice Cream";
                break;
            case "J":
                uri = "@drawable/j";
                picture = "Jellyfish";
                break;
            case "K":
                uri = "@drawable/k";
                picture = "Kangaroo";
                break;
            case "L":
                uri = "@drawable/l";
                picture = "Lion";
                break;
            case "M":
                uri = "@drawable/m";
                picture = "Monkey";
                break;
            case "N":
                uri = "@drawable/n";
                picture = "Nuts";
                break;
            case "O":
                uri = "@drawable/o";
                picture = "Orange";
                break;
            case "P":
                uri = "@drawable/p";
                picture = "Peach";
                break;
            case "Q":
                uri = "@drawable/q";
                picture = "Quail";
                break;
            case "R":
                uri = "@drawable/r";
                picture = "Rabbit";
                break;
            case "S":
                uri = "@drawable/s";
                picture = "Spider";
                break;
            case "T":
                uri = "@drawable/t";
                picture = "Turtle";
                break;
            case "U":
                uri = "@drawable/u";
                picture = "Umbrella";
                break;
            case "V":
                uri = "@drawable/v";
                picture = "Violin";
                break;
            case "W":
                uri = "@drawable/w";
                picture = "Watermelon";
                break;
            case "X":
                uri = "@drawable/x";
                picture = "Xylophone";
                break;
            case "Y":
                uri = "@drawable/y";
                picture = "Yacht";
                break;
            case "Z":
                uri = "@drawable/z";
                picture = "Zebra";
                break;
        }
        int imageResource = getResources().getIdentifier(uri, null, getPackageName());
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        Drawable res = getResources().getDrawable(imageResource);
        imageView.setImageDrawable(res);
        textView.setText(picture);
    }
}
