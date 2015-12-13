package com.java.GUI.BasicGUI.countergudeneme;

/**
 * Created by dedeHan on 13.12.2015.
 */
public class CounterModel2 {

    private int value;

    public CounterModel2()
    {
        value = 0;
    }

    public void increment()
    {
        value++;
    }

    public void decrement()
    {
        value--;
    }

    public int getValue() {
        return value;
    }
}
