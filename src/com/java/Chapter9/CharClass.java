package com.java.Chapter9;

/**
 * Created by dedeHan on 13.12.2015.
 */
public class CharClass {

    public static void main(String[] args) {
        String name = "Sumatra";

        int size = name.length();

        for (int i=0;i<size;i++)
        {
            System.out.println(name.charAt(i));
        }
    }
}
