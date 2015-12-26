package com.java.GUI.BasicGUI.interactiveGraphics;


import com.java.GUI.BasicGUI.SimpleFrame.SimpleFrame;

import java.awt.*;

/**
 * Created by dedeHan on 20.12.2015.
 */
public class InteractiveFrame extends SimpleFrame{

    InteractivePanel iPanel = new InteractivePanel();
    StatusPanel sPanel = new StatusPanel();

    public InteractiveFrame() {

        this.setTitle("Mouse Application");
        this.getContentPane().add(iPanel,BorderLayout.CENTER);
        this.getContentPane().add(sPanel,BorderLayout.SOUTH);
        pack();

        MyMouseListener listen = new MyMouseListener(sPanel,iPanel);
        iPanel.addMouseListener(listen);
        sPanel.addMouseListener(listen);


    }
}
