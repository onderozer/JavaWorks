package com.java.GUI.BasicGUI.trafficLight;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dedeHan on 16.12.2015.
 */
public class LightPanel extends JPanel{

    LightModel lightModel;
    private int countTextLight;
    JLabel redLabel;
    JLabel yellowLabel;
    JLabel greenLabel;

    public LightPanel() {

        lightModel = new LightModel();
        countTextLight = 0;

        redLabel = new JLabel("RED");
        redLabel.setOpaque(true);
        redLabel.setBackground(Color.red);
        redLabel.setForeground(Color.white);
        redLabel.setVisible(false);

        yellowLabel = new JLabel("YELLOW");
        yellowLabel.setOpaque(true);
        yellowLabel.setBackground(Color.yellow);
        yellowLabel.setForeground(Color.white);
        yellowLabel.setVisible(false);

        greenLabel = new JLabel("GREEN");
        greenLabel.setOpaque(true);
        greenLabel.setBackground(Color.green);
        greenLabel.setForeground(Color.white);
        greenLabel.setVisible(false);

        this.add(redLabel);
        this.add(yellowLabel);
        this.add(greenLabel);
    }

    public void changeColorOfText()
    {
        lightModel = new LightModel();
        countTextLight = lightModel.getCounter();

        if (countTextLight == 1) {
            redLabel.setVisible(true);
            yellowLabel.setVisible(false);
            greenLabel.setVisible(false);

            lightModel.setCounter(countTextLight++);
        }

        else if (countTextLight == 2) {
            yellowLabel.setVisible(true);
            redLabel.setVisible(false);
            greenLabel.setVisible(false);

            lightModel.setCounter(countTextLight++);
        }

        else if (countTextLight == 3) {
            greenLabel.setVisible(true);
            redLabel.setVisible(false);
            yellowLabel.setVisible(false);

            lightModel.setCounter(countTextLight++);
        }
    }
}
