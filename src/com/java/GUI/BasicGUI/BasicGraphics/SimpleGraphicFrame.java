package com.java.GUI.BasicGUI.BasicGraphics;

import com.java.GUI.BasicGUI.SimpleFrame.SimpleFrame;

import java.awt.*;

/**
 * Created by dedeHan on 20.12.2015.
 */
public class SimpleGraphicFrame extends SimpleFrame {

    public SimpleGraphicFrame() {
        this.setTitle("Simple Graphics");

        SimpleGraphicPanel sgp = new SimpleGraphicPanel();
        this.getContentPane().add(sgp, BorderLayout.CENTER);

        pack();;

    }
}
