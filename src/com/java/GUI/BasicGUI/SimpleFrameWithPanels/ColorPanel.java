package com.java.GUI.BasicGUI.SimpleFrameWithPanels;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dedeHan on 13.12.2015.
 */
public class ColorPanel extends JPanel {

    //Generate a JPanel with background color
    public ColorPanel(Color col) {
        this.setBackground(col);
    }

    /*
    Generate a JPanel with background color col,
    width width, and height height
     */
    public ColorPanel(Color col, int width, int height)
    {
        this.setPreferredSize(new Dimension(width,height));
        this.setBackground(col);
    }

}
