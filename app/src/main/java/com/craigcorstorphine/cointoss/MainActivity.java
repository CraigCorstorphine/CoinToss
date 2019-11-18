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
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        final ImageView coin = findViewById(R.id.toss_image);

        Button myButton = findViewById(R.id.toss_button);

        final int[] coinArray = new int[]{
                R.drawable.heads,
                R.drawable.tails,
        };
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This code gets executed when the button is pressed

                // Create a random number generator
                Random randomNumberGenerator = new Random();

                // Make the random number generator spit out a new random number
                int number = randomNumberGenerator.nextInt(2);

                // Print this random number to the logcat to see it in the Android monitor
                Log.d("Dicee", "The number is " + number );

                // grab a random dice image from the diceArray. Then tell the ImageView to display
                // this image
                coin.setImageResource(coinArray[number]);

                // Create a new random number
                number = randomNumberGenerator.nextInt(6);

                // Set the right dice image using an image from the diceArray.
                //rightDice.setImageResource(diceArray[number]);


            }
        });



       /* FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
