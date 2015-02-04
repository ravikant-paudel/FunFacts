package com.kathnepal.paudel.funfacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class FunActivity extends Activity {

    private FactBook mFactBook = new FactBook();
    private ColourWheel mColourWheel = new ColourWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun);

        //declare our view variables and assign the view from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.funFactsTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactsButton);
        final RelativeLayout relativeLayoutName = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.getFacts();

                //update the fact
                factLabel.setText(fact);

                int colour = mColourWheel.getColour();
                relativeLayoutName.setBackgroundColor(colour);
                showFactButton.setTextColor(colour);

                }
        };
        showFactButton.setOnClickListener(Listener);

        }

}
