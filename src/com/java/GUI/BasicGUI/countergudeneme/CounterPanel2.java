package com.java.GUI.BasicGUI.countergudeneme;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dedeHan on 13.12.2015.
 */
public class CounterPanel2 extends JPanel {

    private CounterModel2 countMod2;
    private JLabel valueLabel;

    public CounterPanel2()
    {
        countMod2 = new CounterModel2();
        BorderLayout bordLay = new BorderLayout();
        this.setLayout(bordLay);

        JButton upButton = new JButton("UP");
        JButton downButton = new JButton("DOWN");

        valueLabel = new JLabel(""+countMod2.getValue(),SwingConstants.CENTER);

        CounterListener2 list2 = new CounterListener2(this);
        upButton.addActionListener(list2);
        downButton.addActionListener(list2);

        this.add(upButton,BorderLayout.WEST);
        this.add(downButton,BorderLayout.EAST);
        this.add(valueLabel,BorderLayout.CENTER);
    }

    public void decrement()
    {
        countMod2.decrement();
        valueLabel.setText(""+countMod2.getValue());
    }

    public void increment()
    {
        countMod2.increment();
        valueLabel.setText(""+countMod2.getValue());
    }
}
