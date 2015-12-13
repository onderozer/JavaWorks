package com.sampleDev;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * Created by dedeHan on 5.12.2015.
 */
public class MealCard {

    private static double BALANCE = 100.0;

    public String name;
    public double balance;
    public double remainder;
    public double price;

    public MealCard(String name, double price) {
        this(name,BALANCE,price);
    }

    public MealCard(String name, double balance, double price) {
        setName(name);
        setBalance(balance);
        setRemainder(balance,price);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRemainder() {
        return remainder;
    }

    public void setRemainder(double balance, double price) {
        this.remainder = balance- price;
        if(getRemainder()<=0)
        {
            System.err.println(getName() +" balance is less than price");
            System.exit(1);
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString()
    {
        return String.format("name = " +getName() + " balance = " +getBalance() + " price = " +getPrice() + " remainder = " +getRemainder());
    }
}
