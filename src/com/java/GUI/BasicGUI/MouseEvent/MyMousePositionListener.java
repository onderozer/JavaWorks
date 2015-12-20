package com.java.GUI.BasicGUI.MouseEvent;

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
    }

    public void mouseDragged(MouseEvent evt)
    {

    }
}
