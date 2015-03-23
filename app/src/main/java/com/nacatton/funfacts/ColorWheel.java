package com.nacatton.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by nacatton on 01/03/15.
 */
public class ColorWheel {

    // Member variable (properties about the object)
    public String[] mColors = {

            "#a239c6", // Moderate violet
            "#f092b0", // pink
            "#b7c0c7", // light gray
            "#33ff00",  // Pure (or mostly pure) lime green
            "#cc6600", // Strong Orange
            "#ccffff", // pale blue
            "#ffccff" // light pink



    };

    // Method (abilities: things the objects can do)
    public int getColor() {

        String color = "";

        // Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new Random generator
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;



    }
}
