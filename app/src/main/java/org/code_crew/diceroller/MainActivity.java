package org.code_crew.diceroller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button roll;
    Random rand = new Random();
    ImageView die;
    int r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roll = findViewById(R.id.button_roll);
        die = findViewById(R.id.imageView);


    }

    public void rollDie(View view) {

        r = rand.nextInt(6) +1;

        switch (r){
            case(1):
                die.setImageResource(R.drawable.one);
                break;
            case(2):
                die.setImageResource(R.drawable.two);
                break;
            case(3):
                die.setImageResource(R.drawable.three);
                break;
            case(4):
                die.setImageResource(R.drawable.four);
                break;
            case(5):
                die.setImageResource(R.drawable.five);
                break;
            case(6):
                die.setImageResource(R.drawable.six);
                break;
        }
    }
}