package com.java.GUI.BasicGUI.Layouts;

import com.java.GUI.BasicGUI.SimpleFrame.SimpleFrame;
import java.awt.LayoutManager;
import java.awt.Color;
import com.java.GUI.BasicGUI.SimpleFrameWithPanels.ColorPanel;
/**
 * Created by dedeHan on 13.12.2015.
 */
public class LayoutFrame extends SimpleFrame {

    public LayoutFrame(LayoutManager layout) {

        this.getContentPane().setLayout(layout);

        ColorPanel cp1 = new ColorPanel(Color.red,30,30);
        ColorPanel cp2 = new ColorPanel(Color.yellow,40,30);
        ColorPanel cp3 = new ColorPanel(Color.green);
        ColorPanel cp4 = new ColorPanel(Color.blue);
        ColorPanel cp5 = new ColorPanel(Color.white,80,20);

        this.getContentPane().add(cp1);
        this.getContentPane().add(cp2);
        this.getContentPane().add(cp3);
        this.getContentPane().add(cp4);
        this.getContentPane().add(cp5);


    }
}
