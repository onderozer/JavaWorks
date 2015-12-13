package com.sampleDev.test;

import com.sampleDev.MealCard;

/**
 * Created by dedeHan on 5.12.2015.
 */
public class MealCardTest {

    public static void main(String[] args) {
        MealCard card,card1,card2;

        card = new MealCard("osman",80.0,20.0);
        System.out.println(card.toString());
        card2 = new MealCard("aka",40.0);
        System.out.println(card2.toString());
       // card1 = new MealCard("ali",80.0,100.0);
        //System.out.println(card1.toString());
    }
}
