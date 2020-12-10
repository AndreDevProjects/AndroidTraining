package com.example.aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnInt = (Button) findViewById(R.id.buttonInt);
        Button btnExt = (Button) findViewById(R.id.buttonExt);
        Button btnPer = (Button) findViewById(R.id.buttonPer);
    }

    public void goToPerformance(View view){
        Intent intent = new Intent(this, PerformanceMods.class);
        startActivity(intent);
    }
    public void goToExterior(View view){
        Intent intent = new Intent(this, ExteriorMods.class);
        startActivity(intent);
    }
    public void goToInterior(View view){
        Intent intent = new Intent(this, InteriorMods.class);
        startActivity(intent);
    }



}