package com.java.GUI.BasicGUI.textcolorChanger;

import com.java.GUI.BasicGUI.SimpleFrame.SimpleFrame;

import java.awt.*;

/**
 * Created by dedeHan on 16.12.2015.
 */
public class ColorChangeFrame extends SimpleFrame{

    public ColorChangeFrame() {

        this.setSize(200,200);
        ColorChangerPanel colPanel = new ColorChangerPanel();
        this.getContentPane().add(colPanel, BorderLayout.CENTER);

    }
}
