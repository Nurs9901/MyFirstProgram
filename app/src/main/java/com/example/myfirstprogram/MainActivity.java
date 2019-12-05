package com.example.myfirstprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int imageNum = 0;
    Drawable[] drawables;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text = findViewById(R.id.text1);
        Button button = findViewById(R.id.knopa);
        final EditText vasia = findViewById(R.id.editText3);
        final Button touch = findViewById(R.id.touch);
        final ImageView img = findViewById(R.id.image);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(vasia.getText());
            }
        });

        Drawable myIcon = getResources().getDrawable(R.drawable.file1);
        Drawable youIcon = getResources().getDrawable(R.drawable.file2);
        Drawable ourIcon = getResources().getDrawable(R.drawable.file3);
        Drawable[] drawables = new Drawable[3];
        drawables[0] = myIcon;
        drawables[1] = youIcon;
        drawables[2] = ourIcon;
        this.drawables = drawables;

        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               img.setImageDrawable(getNextImage());
            }
        }) ;
    }
    private Drawable getNextImage() {
       imageNum++;
       if (imageNum >= drawables.length) {
           imageNum = 0;
       }
        return drawables[imageNum];

    }

}
