package com.java.GUI.BasicGUI.interactiveGraphics;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dedeHan on 26.12.2015.
 */
public class InteractivePanel extends JPanel{

    private CircleAdministration circleAdm;
    private double radius = 1.0;

    public InteractivePanel() {
        circleAdm = new CircleAdministration();
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(300,300));
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        circleAdm.drawAll(g);
    }

    public void addCircle(int x, int y)
    {
        circleAdm.addCircle(new Circle(x,y,radius));
        repaint();
    }

    public void removeNearestCircle(int x, int y)
    {
        circleAdm.removeNearestCircle(x,y);
        repaint();
    }

    public int getNoOfCircle()
    {
        return(circleAdm.getNoOfCircles());
    }

}
