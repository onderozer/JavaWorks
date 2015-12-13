package com.java.GUI.BasicGUI.CounterGUI;

/**
 * Created by dedeHan on 13.12.2015.
 */
public class CounterModel {

    private int value;

    public CounterModel() {
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

    public void reset()
    {
        value = 0;
    }

    public int getValue() {
        return value;
    }
}
