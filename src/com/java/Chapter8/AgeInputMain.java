package com.java.Chapter8;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by dedeHan on 9.12.2015.
 */
public class AgeInputMain {

    public static void main(String[] args) throws Exception{
        GregorianCalendar today;

        int age, thisYear, bornYr;

        String answer;

        Scanner scanner = new Scanner(System.in);

        AgeInputVer4 input = new AgeInputVer4();

        //try
        //{
            age = input.getAge();
        //}catch (Exception e)
        //{
            //e.printStackTrace();
        //}


        today = new GregorianCalendar();
        thisYear = today.get(Calendar.YEAR);
        bornYr = thisYear - age;

        System.out.print("had your bird this year (Y / N)");
        answer = scanner.next();

        if(answer.equals("N") || answer.equals("n"))
        {
            bornYr--;
        }

        System.out.print("\nYou are born in " + bornYr);
    }

}
