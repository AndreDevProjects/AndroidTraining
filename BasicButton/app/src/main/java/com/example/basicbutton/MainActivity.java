package com.example.basicbutton;

import androidx.annotation.ContentView;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView view1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button);
        view1 = findViewById(R.id.image1);
    }

    public void changeColor(View view) {
        Random random = new Random();
        view.setBackgroundColor(Color.GREEN);
        view1.setBackgroundColor(Color.rgb(255, random.nextInt(256),random.nextInt(256)));
    }
}