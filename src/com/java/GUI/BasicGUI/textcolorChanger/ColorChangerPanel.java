package com.java.GUI.BasicGUI.textcolorChanger;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dedeHan on 16.12.2015.
 */
public class ColorChangerPanel extends JPanel {

    ColorChangerModel changerModel;
    JLabel colorLabel;

    public ColorChangerPanel() {

        changerModel = new ColorChangerModel();

        GridLayout grid = new GridLayout(2,2);
        this.setLayout(grid);

        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");
        JButton yellowButton = new JButton("Yellow");
        colorLabel = new JLabel("");

        this.add(redButton);
        this.add(greenButton);
        this.add(yellowButton);
        this.add(colorLabel);

        ColorChangeListener listen = new ColorChangeListener(this);
        redButton.addActionListener(listen);
        greenButton.addActionListener(listen);
        yellowButton.addActionListener(listen);

    }

    public void changeTextColor(Color col)
    {
        changerModel = new ColorChangerModel();
        changerModel.changeColor(colorLabel,col);
    }
}
