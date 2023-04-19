package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView text = (TextView) findViewById(R.id.Text1);


        Bundle extras = getIntent().getExtras();
        if(extras!= null) {
            String displayText = extras.getString("Text");
            text.setText(displayText);
        }
    }
}