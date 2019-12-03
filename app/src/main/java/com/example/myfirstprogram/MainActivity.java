package com.example.myfirstprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text = findViewById(R.id.text1);
        Button button = findViewById(R.id.knopa);
        final EditText vasia = findViewById(R.id.editText3);
        Button touch = findViewById(R.id.touch);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(vasia.getText());


            }
        });
        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int
            }
        }) ;
    }
}
