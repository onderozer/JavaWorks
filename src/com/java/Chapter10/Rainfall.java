package com.java.Chapter10;

import java.util.Scanner;

/**
 * Created by dedeHan on 13.12.2015.
 */
public class Rainfall {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rainfall[] = new double[12];
        double annualAverage, sum, difference;

        sum = 0.0;

        for(int i = 0; i<12; i++)
        {
            System.out.print("rainfall mounth :" +(i+1) + ":");
            rainfall[i] = scanner.nextDouble();

            sum +=rainfall[i];
        }

        annualAverage = sum / 12.0;

        System.out.println(annualAverage);


    }
}
