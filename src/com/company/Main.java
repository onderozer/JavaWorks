package com.company;

import com.java.Chapter7.Fraction;

public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
	// write your code here
        System.out.println("OK");
        Fraction f1,f2,f3;
        f1= new Fraction(1,2);
        f2 = new Fraction(1,4);

        f3 = f1.subtract(f2);
        System.out.println("sum of" + f1.toString() + "and" +
        f2.toString() + "is" + f3.toString());
    }
}
