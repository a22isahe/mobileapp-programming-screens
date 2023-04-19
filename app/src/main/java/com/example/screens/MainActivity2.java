package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView text = (TextView) findViewById(R.id.Text1);
        Button button2 = (Button) findViewById(R.id.button);

        Bundle extras = getIntent().getExtras();
        if(extras!= null) {
            String displayText = extras.getString("Text") + ". Den här texten är främmande!";
            text.setText(displayText);
        }
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}