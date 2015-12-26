package com.java.GUI.BasicGUI.interactiveGraphics;

import java.awt.*;
import java.util.Vector;

/**
 * Created by dedeHan on 26.12.2015.
 */
public class CircleAdministration {

    private Vector circles;

    public CircleAdministration() {
        circles = new Vector();
    }

    public void addCircle(Circle circ)
    {
        circles.add(circ);
    }

    public void removeNearestCircle(int x1, int y1)
    {
        Circle circ;
        double minDist = Double.MAX_VALUE;
        int minDisIndex = -1;
        for (int i =0;i<circles.size();i++)
        {
            circ = (Circle)(circles.get(i));
            if (circ.distanceTo(x1,y1) < minDist)
            {
                minDist = circ.distanceTo(x1,y1);
                minDisIndex = i;
            }
        }

        if (minDisIndex >= 0 && minDist < 300)
        {
            circles.removeElementAt(minDisIndex);
        }
    }

    public void drawAll(Graphics g)
    {
        Circle currentCircle;

        for (int i =0;i<circles.size();i++)
        {
            currentCircle = (Circle)(circles.get(i));
            currentCircle.draw(g);
        }
    }

    public  int getNoOfCircles()
    {
        return (circles.size());
    }
}
