package com.java.GUI.BasicGUI.trafficLight;

import javax.swing.*;

/**
 * Created by dedeHan on 16.12.2015.
 */
public class LightModel {

    private int counter;

    public LightModel()
    {
        counter = 0;
    }

    public int changeText(JLabel label)
    {
        label.setVisible(true);
        counter++;
        return counter;
    }
}
