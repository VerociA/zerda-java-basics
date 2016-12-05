package com.greenfox.exams.java;

import java.util.Random;

/**
 * Created by Verőci Ádám on 2016.12.05..
 */
public class Card extends Deck{
    private int colorValue;

    Card(){
        colorValue = randomCard();
    }

    public int getValue(){
        return colorValue;
    }

    private int randomCard(){
        int min = 2;
        int max = 11;
        int range = (max - min);

        int random = new Random().nextInt(range + 1) + min;

        return random;
    }
}

