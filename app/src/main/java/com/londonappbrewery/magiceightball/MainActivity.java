package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ImageView imgBall = findViewById(R.id.image_eightBall);
        Button btnAsk = findViewById(R.id.askButton);

        final int[] ballAray = {R.drawable.ball1,
        R.drawable.ball2,
        R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5};


        btnAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumerGenerator = new Random();
                int number = randomNumerGenerator.nextInt(5);

                imgBall.setImageResource(ballAray[number]);

                Log.d("8ball", "number" + number);

            }
        });



    }
}
