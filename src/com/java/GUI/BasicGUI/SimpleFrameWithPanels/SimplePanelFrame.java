package com.java.GUI.BasicGUI.SimpleFrameWithPanels;

import com.java.GUI.BasicGUI.SimpleFrame.SimpleFrame;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Created by dedeHan on 13.12.2015.
 */
public class SimplePanelFrame extends SimpleFrame{

    public SimplePanelFrame() {

        ColorPanel CPwest = new ColorPanel(Color.white,50,20);
        ColorPanel CPeast = new ColorPanel(Color.red);
        ColorPanel CPnorth = new ColorPanel(Color.yellow);
        ColorPanel CPsouth = new ColorPanel(Color.green);
        ColorPanel CPcenter = new ColorPanel(Color.blue);

        this.getContentPane().add(CPwest,BorderLayout.WEST);
        this.getContentPane().add(CPeast,BorderLayout.EAST);
        this.getContentPane().add(CPnorth,BorderLayout.NORTH);
        this.getContentPane().add(CPsouth,BorderLayout.SOUTH);
        this.getContentPane().add(CPcenter,BorderLayout.CENTER);
    }
}
