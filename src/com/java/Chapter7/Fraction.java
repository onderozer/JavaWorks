package com.java.Chapter7;

/**
 * Created by dedeHan on 26.11.2015.
 */
public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int num, int denom) {
        if (denom<0)
        {
            num = -num;
            denom = -denom;
        }
        if(num == 0)
        {
            denom = 1;
        }
        setNumerator(num);
        setDenominator(denom);
    }
    /*
    copy constructor
    public Fraction(Fraction frac)
    {
        setNumerator(frac.getNumerator());
        setDenominator(frac.getDenominator());
    }
    */


    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int num) {
        numerator = num;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denom) {
        if (denom==0)
        {
            //Fatal error
            System.err.println("Fatal err");
            System.exit(-1);
        }

        denominator=denom;
    }


    public String toString() {
        return getNumerator() + "/" + getDenominator();
    }

    public static int gdc(int m, int n)
    {
        int r=n%m;
        while (r!=0){
            n=m;
            m=r;
            r=n%m;
        }
        return m;
    }


    public Fraction simplify()
    {
        int num = getNumerator();
        int denom = getDenominator();
        int gdc = 1;

        if (num !=0)
        {
            gdc = gdc(num,denom);
        }


        Fraction simp = new Fraction(num/gdc,denom/gdc);
        return simp;

    }

    public Fraction add(Fraction frac)
    {
        int a,b,c,d;

        Fraction sum;

        a = this.getNumerator();
        b = this.getDenominator();

        c = frac.getNumerator();
        d = frac.getDenominator();

        sum = new Fraction(a*d + b*c, b*d);

        return sum;
    }

    public Fraction add(int number)
    {
        int a,b,c,d;
        Fraction sum;

        a = this.getNumerator();
        b = this.getDenominator();

        c = number;
        d=1;

        sum = new Fraction(a*d + b*c, b*d);

        return sum;

    }

    public Fraction subtract(Fraction frac)
    {
        int a,b,c,d;

        Fraction diff;

        a = this.getNumerator();
        b = this.getDenominator();

        c = frac.getNumerator();
        d = frac.getDenominator();

        diff = new Fraction(a*d - b*c,b*d);

        return diff;
    }

    public Fraction multiply(Fraction frac)
    {
        int a,b,c,d;
        Fraction product;

        a = this.getNumerator();
        b = this.getDenominator();

        c = frac.getNumerator();
        d = frac.getDenominator();

        product = new Fraction(a*c,b*d);

        return product;

    }

     public Fraction divide(Fraction frac)
     {
         int a,b,c,d;
         Fraction quotient;

         a = this.getNumerator();
         b = this.getDenominator();

         c = frac.getNumerator();
         d = frac.getDenominator();

         quotient = new Fraction(a*d,b*c);

         return quotient;


     }
}

