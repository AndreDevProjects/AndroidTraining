package com.example.aboutme;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExteriorMods extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceBundle){
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.activity_exterior);
        TextView view = findViewById(R.id.exteriorTextView);
        view.setText("\u2022Wing raisers\n\u2022Diffuser Fins\n\u2022Canards\n\u2022Custom Rim Paint with Hoonigan sticker\n\u2022Team ST Membership Number Sticker\n\u2022Tinted Fog Lights\n\u2022Karter Performance Sun Strip\n\u2022Lumo Green Ford and ST Badges");

    }
}
