package com.java.GUI.BasicGUI.MouseEvent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by dedeHan on 20.12.2015.
 */
public class MyMouseListener implements MouseListener{

    private StatusPanel statusPanel;

    public MyMouseListener(StatusPanel s) {
        statusPanel = s;
    }


    public void mouseClicked(MouseEvent e) {
        statusPanel.incrementClickCount();
    }


    public void mousePressed(MouseEvent e) {

    }


    public void mouseReleased(MouseEvent e) {

    }


    public void mouseEntered(MouseEvent e) {
        statusPanel.setInOut("yes");
    }


    public void mouseExited(MouseEvent e) {
        statusPanel.setInOut("no");
        statusPanel.setCoordinates(-1,-1);
    }

}
