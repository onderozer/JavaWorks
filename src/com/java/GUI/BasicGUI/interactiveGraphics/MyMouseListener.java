package com.java.GUI.BasicGUI.interactiveGraphics;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by dedeHan on 26.12.2015.
 */
public class MyMouseListener implements MouseListener{

    private StatusPanel statusPane;
    private InteractivePanel interativePane;

    public MyMouseListener(StatusPanel s, InteractivePanel i) {
        statusPane = s;
        interativePane = i;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        statusPane.incrementClickCount();
        if (SwingUtilities.isLeftMouseButton(e)) {
            interativePane.addCircle(e.getX(), e.getY());
        }
        else
        {
            interativePane.removeNearestCircle(e.getX(),e.getY());
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        statusPane.setInOut("yes");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        statusPane.setInOut("no");
        statusPane.setCoordinates(-1,-1);
    }
}
