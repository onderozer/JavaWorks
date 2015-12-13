package com.java.calismalar.chapter6;

import java.util.Scanner;

/**
 * Created by dedeHan on 9.12.2015.
 */
public class Loops {

    private static final String DEFAULT_QUESTION = "enter number";
    //private static final int MAX_NUM = 50;

    Scanner scanner;
    //int num;

    private int number;

    public Loops() {
        scanner = new Scanner(System.in);
    }

    public void inputNumber()
    {
        inputNumber(DEFAULT_QUESTION);
    }

    public void inputNumber(String question)
    {

        System.out.print(question);

        try {
            number = scanner.nextInt();
            if (number != 10)
            {
                throw new Exception("given number is not valid");
            }

            for(int i=0;i<4;i++)
            {
                int num=0;
                for (int j=0;j<10;j++)
                {
                    System.out.print(number+j + " ");
                    num = number + j;
                }
                System.out.print("\n");
                number = num+1;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
