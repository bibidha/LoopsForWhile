package com.bibidha.loopsforwhile;
/* Copyright www.bibidha.com created 13 May 2016*/

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        int x = 51;
        while (x > 12) {
            x = x--; /*Decrement by one*/
            {
                for (x = 0; x < 10; x++)/*autoincrement x inside for loop*/ {


                    TextView myTextView = new TextView(this);
                    myTextView.setText("The answer of lesson 2 Loops For and While is   =  " + x);
                    setContentView(myTextView);

                }
            }
        }
    }
}
