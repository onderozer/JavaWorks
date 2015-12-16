package com.java.GUI.BasicGUI.trafficLight;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dedeHan on 16.12.2015.
 */
public class LightListener implements ActionListener{

    private LightPanel lPanel;

    public LightListener(LightPanel p) {

        lPanel = p;
    }

    public void actionPerformed(ActionEvent evt)
    {
        lPanel.changeColorOfText();
    }
}
