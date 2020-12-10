package com.example.aboutme;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InteriorMods extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceBundle){
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.activity_interior);
        TextView view = findViewById(R.id.interiorTextView);
        view.setText("\u2022Lumo Green Ford Badge");
    }

}
