package com.example.aboutme;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.aboutme.R.layout.activity_performance;

public class PerformanceMods extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_performance);
        TextView view = findViewById(R.id.exteriorTextView);
        view.setText("\u2022Karter Stage 2 Cold Air Intake\n\u2022Hot and Cold Side Boost Pipes\n\u2022Airtec Stage 2 Intercooler\n\u202276mm Downpipe\n\u2022Karter Cat Back Exhaust\n\u2022Cobb Stage 3 Software\n\u2022Cobb Accessport");

    }
}
