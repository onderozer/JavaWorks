package com.java.GUI.BasicGUI.interactiveGraphics;

import java.awt.*;

/**
 * Created by dedeHan on 26.12.2015.
 */
public class Circle {

    private double x,y,radius;

    public Circle(double rad, double yy, double xx) {
        radius = rad;
        y = yy;
        x = xx;
    }

    //draw circle
    public void draw(Graphics g)
    {
        g.fillOval((int)Math.round(x-radius),(int)Math.round(y-radius),
                (int)Math.round(2.0*radius),(int)Math.round(2.0*radius));
    }

    //computes the distance between the circle's
    //centre and the point(x1,y1)

    public double distanceTo(double x1, double y1)
    {
        return (Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2)));
    }

}
