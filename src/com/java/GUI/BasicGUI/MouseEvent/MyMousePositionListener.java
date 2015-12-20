package com.java.GUI.BasicGUI.MouseEvent;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 * Created by dedeHan on 20.12.2015.
 */
public class MyMousePositionListener implements MouseMotionListener{

    private StatusPanel statusPanel;

    public MyMousePositionListener(StatusPanel s) {
        statusPanel = s;
    }

    public void mouseMoved(MouseEvent evt)
    {
        statusPanel.setCoordinates(evt.getX(),evt.getY());

        int x = evt.getX();
        int y = evt.getY();

        if (x<50 && y<50) {
            statusPanel.repaintPanel();
        }

        else
        {
            statusPanel.setBackground(Color.white);
        }
    }

    public void mouseDragged(MouseEvent evt)
    {

    }


}
