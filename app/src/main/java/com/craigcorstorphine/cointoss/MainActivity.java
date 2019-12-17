package com.craigcorstorphine.cointoss;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ImageView coin = findViewById(R.id.toss_image);

        Button myButton = findViewById(R.id.toss_button);

        final int[] coinArray = new int[]{
                R.drawable.coin1,
                R.drawable.coin2,
        };
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // Create a random number generator
                Random randomNumberGenerator = new Random();

                // Make the random number generator spit out a new random number
                int number = randomNumberGenerator.nextInt(2);


                coin.setImageResource(coinArray[number]);


            }
        });


    }


}
