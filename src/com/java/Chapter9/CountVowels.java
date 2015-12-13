package com.java.Chapter9;

import java.util.Scanner;

/**
 * Created by dedeHan on 13.12.2015.
 */
public class CountVowels {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //scanner.useDelimiter(System.getProperty("line.seperator"));

        String name;

        int numberOfCountChar, vowelCount=0;
        char letter;

        System.out.print("your name");
        name = scanner.next();

        numberOfCountChar = name.length();

        for(int i = 0; i < numberOfCountChar; i++)
        {
            letter = name.charAt(i);

            if (letter == 'a' || letter == 'A' ||
                    letter == 'e' || letter == 'E' ||
                    letter == 'i' || letter == 'I' ||
                    letter == 'o' || letter == 'O' ||
                    letter == 'u' || letter == 'U' )
                {
                    vowelCount++;
                }
        }

        System.out.print("your name includes :" + vowelCount + "vowels");
    }
}
