package com.example.bfull.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String[] message = intent.getStringArrayExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.textView);
        textView.setText(message[0]);
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText(message[1]);
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setText(message[2]);
        TextView textView4 = findViewById(R.id.textView4);
        textView4.setText(message[3]);
        TextView textView5 = findViewById(R.id.textView5);
        textView5.setText(message[4]);
        TextView textView6 = findViewById(R.id.textView6);
        textView6.setText(message[5]);
    }
}
