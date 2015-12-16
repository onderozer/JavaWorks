package com.java.GUI.BasicGUI.textcolorChanger;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dedeHan on 16.12.2015.
 */
public class ColorChangerModel {

    private JLabel colorLabel;
    private Color color;

    public ColorChangerModel() {

        colorLabel = new JLabel();
        colorLabel.setVisible(false);
    }

    public void changeColor(JLabel label,Color col)
    {
        this.colorLabel = label;
        this.color = col;
        colorLabel.setBackground(color);
        colorLabel.setOpaque(true);
        colorLabel.setForeground(Color.white);
        colorLabel.setVisible(true);

    }
}
