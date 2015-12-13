package com.java.GUI.BasicGUI.GUIChapter3Exe;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dedeHan on 13.12.2015.
 */
public class ClickPanel extends JPanel {

    private ClickModel model;

    private JLabel valueLabel;

    public ClickPanel()
    {
        model = new ClickModel();

        GridLayout grid = new GridLayout(3,2);
        this.setLayout(grid);

        JButton firstButton = new JButton("1");
        JButton secondButton = new JButton("2");
        JButton thirdButton = new JButton("3");
        JButton fourthButton = new JButton("4");

        valueLabel = new JLabel(""+model.getValue());

        this.add(firstButton);
        this.add(secondButton);
        this.add(thirdButton);
        this.add(fourthButton);
        this.add(valueLabel);

        ClickListener cListen = new ClickListener(this);
        firstButton.addActionListener(cListen);
        secondButton.addActionListener(cListen);
        thirdButton.addActionListener(cListen);
        fourthButton.addActionListener(cListen);

    }

    public void setValue(String value)
    {
        model.setValue(value);
        valueLabel.setText("Clicked button :"+model.getValue());
    }
}
