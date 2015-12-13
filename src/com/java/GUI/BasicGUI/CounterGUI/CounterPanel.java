package com.java.GUI.BasicGUI.CounterGUI;

import javax.swing.*;
import java.awt.*;
import javax.swing.SwingConstants;

/**
 * Created by dedeHan on 13.12.2015.
 */
public class CounterPanel extends JPanel{

    private CounterModel counter;
    private JLabel valueLabel;

    public CounterPanel() {

        counter = new CounterModel();

        BorderLayout bordLay = new BorderLayout();
        this.setLayout(bordLay);

        //GridLayout grid = new GridLayout(2,3);
        //this.setLayout(grid);

        JButton upButton = new JButton("UP");
        JButton downButton = new JButton("DOWN");
        //JButton resetButton = new JButton("RESET");

        valueLabel = new JLabel("" + counter.getValue(),SwingConstants.CENTER);

        this.add(upButton,BorderLayout.WEST);
        this.add(downButton,BorderLayout.EAST);
        this.add(valueLabel,BorderLayout.CENTER);

        //this.add(resetButton,BorderLayout.SOUTH);

        CounterListener countLis = new CounterListener(this);
        upButton.addActionListener(countLis);
        downButton.addActionListener(countLis);
        //resetButton.addActionListener(countLis);
    }

    public void increment()
    {
        counter.increment();
        valueLabel.setText(""+counter.getValue());
    }

    public void decrement()
    {
        counter.decrement();
        valueLabel.setText(""+counter.getValue());
    }

    public void reset()
    {
        counter.reset();
        valueLabel.setText(""+counter.getValue());
    }
}
