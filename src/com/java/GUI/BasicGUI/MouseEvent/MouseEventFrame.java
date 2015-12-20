package com.java.GUI.BasicGUI.MouseEvent;

import com.java.GUI.BasicGUI.SimpleFrame.SimpleFrame;
import java.awt.BorderLayout;
/**
 * Created by dedeHan on 20.12.2015.
 */
public class MouseEventFrame extends SimpleFrame{

    MouseEventPanel mePanel = new MouseEventPanel();
    StatusPanel stPanel = new StatusPanel();

    public MouseEventFrame() {

        this.setTitle("Mouse Application");
        this.getContentPane().add(mePanel,BorderLayout.CENTER);
        this.getContentPane().add(stPanel,BorderLayout.SOUTH);
        pack();

        MyMousePositionListener posListen = new MyMousePositionListener(stPanel);
        mePanel.addMouseMotionListener(posListen);
        //posListen.changePanelColor();

        MyMouseListener mouListen = new MyMouseListener(stPanel);
        mePanel.addMouseListener(mouListen);

    }
}
