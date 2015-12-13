package com.java.Chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by dedeHan on 9.12.2015.
 */
public class AgeInputVer1 {
    private static final String DEFAULT_MESSAGE = "Your Age :";

    private Scanner scanner;
    private int age;

    public AgeInputVer1() {
        scanner = new Scanner(System.in);
    }

    public int getAge() throws Exception
    {
        return getAge(DEFAULT_MESSAGE);
    }

    private int getAge(String prompt) {

        //boolean keepGoing = true;
        while(true)
        {
            System.out.print(prompt);

            try {

                age = scanner.nextInt();
                //keepGoing = false;
                if(age<0)
                {
                    throw new Exception("negative age is impossible");
                }

                return age;

            }catch (InputMismatchException e)
            {
                scanner.next();
                System.out.println("Input is invalid");
                //e.printStackTrace();
                //System.out.print(prompt);
            }catch (Exception e)
            {
                System.out.println("Error : " + e.getMessage());
            }
        }

    }


}
