package com.gordonez.ej3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView redColor = findViewById(R.id.color_red);
        TextView greenColor = findViewById(R.id.color_green);
        TextView blueColor = findViewById(R.id.color_blue);

        redColor.setOnClickListener(this);
        blueColor.setOnClickListener(this);
        greenColor.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
