package com.nacatton.funfacts;

import java.util.Random;

/**
 * Created by nacatton on 01/03/15.
 */
public class FactBook {

    // Member variable (properties about the object)
    public String[] mFacts = {
            "Juli and Nick will make an amazing app.",
            "We will make something functional.",
            "Life is difficult"};

    // Method (abilities: things the objects can do)
    public String getFact() {

       String fact = "";

        // Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new Random generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;



    }
}
