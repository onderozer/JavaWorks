package com.java.GUI.BasicGUI.MouseEvent;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dedeHan on 20.12.2015.
 */
public class StatusPanel extends JPanel{

    private JLabel posText = new JLabel("position :");
    private JLabel XCoord = new JLabel("0", JLabel.RIGHT);
    private JLabel YCoord = new JLabel("0", JLabel.LEFT);
    private JLabel countText = new JLabel("no. of clicks");
    private JLabel counts = new JLabel("0", JLabel.RIGHT);
    private JLabel dummy1 = new JLabel();
    private JLabel inOutText = new JLabel("mouse in comp.");
    private JLabel inOut = new JLabel("no", JLabel.RIGHT);
    private JLabel dummy2 = new JLabel();
    private int clickCount = 0;

    public StatusPanel() {

        this.setLayout(new GridLayout(3,3));
        this.add(posText);
        this.add(XCoord);
        this.add(YCoord);
        this.add(countText);
        this.add(counts);
        this.add(dummy1);
        this.add(inOutText);
        this.add(inOut);
        this.add(dummy2);
    }

    public void setCoordinates(int x, int y)
    {
        XCoord.setText("x :" + Integer.toString(x));
        YCoord.setText("y :" + Integer.toString(y));
    }

    public void setInOut(String str)
    {
        inOut.setText(str);
    }

    public void incrementClickCount()
    {
        clickCount++;
        counts.setText(Integer.toString(clickCount));
    }


}
