package com.java.GUI.BasicGUI.trafficLight;

import javax.swing.*;

/**
 * Created by dedeHan on 16.12.2015.
 */
public class LightModel {

    private int counter;

    public LightModel()
    {
        counter = 1;
    }

    public void changeText(JLabel label)
    {
        label.setVisible(true);
        setCounter(counter+1);

        if (this.getCounter() == 4) {
            setCounter(1);
        }

    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
