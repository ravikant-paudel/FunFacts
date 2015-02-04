package com.kathnepal.paudel.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Paudel on 04-Feb-15.
 */
public class ColourWheel {

    public String[] mColour = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7"

            };


    public int getColour(){


        String colour = "";
        //Randomly select facts
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColour.length);

        colour = mColour[randomNumber];
        int colourAsInt = Color.parseColor(colour);
        return colourAsInt;

    }



}
