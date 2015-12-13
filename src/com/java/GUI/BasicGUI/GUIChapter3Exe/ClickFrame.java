package com.java.GUI.BasicGUI.GUIChapter3Exe;

import com.java.GUI.BasicGUI.SimpleFrame.SimpleFrame;

import java.awt.*;

/**
 * Created by dedeHan on 13.12.2015.
 */
public class ClickFrame extends SimpleFrame {

    public ClickFrame()
    {
        ClickPanel cPanel = new ClickPanel();
        this.getContentPane().add(cPanel, BorderLayout.CENTER);
        //this.showIt("Click action");
    }




}
