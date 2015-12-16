package com.java.GUI.BasicGUI.trafficLight;

import com.java.GUI.BasicGUI.SimpleFrame.SimpleFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dedeHan on 16.12.2015.
 */
public class LightFrame extends SimpleFrame {

    public LightFrame() {

        this.setSize(200,200);
        LightPanel lPanel = new LightPanel();

        this.getContentPane().add(lPanel, BorderLayout.CENTER);

        JButton changeButton = new JButton("Change");
        this.getContentPane().add(changeButton,BorderLayout.SOUTH);

        LightListener listen = new LightListener(lPanel);
        changeButton.addActionListener(listen);

    }
}
