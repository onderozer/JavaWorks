package com.java.GUI.BasicGUI.GUIChapter3Exe2;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dedeHan on 13.12.2015.
 */
public class ClickPanel2 extends JPanel{

    private ClickModel2 model2;
    private JLabel valulabel;


    public ClickPanel2() {

        model2 = new ClickModel2();

        GridLayout layout = new GridLayout(3,2);
        this.setLayout(layout);

        JButton firstBut = new JButton("1");
        JButton secondBut = new JButton("2");
        JButton thirddBut = new JButton("3");
        JButton fourthBut = new JButton("4");

        valulabel = new JLabel(""+model2.getValue());

        this.add(firstBut);
        this.add(secondBut);
        this.add(thirddBut);
        this.add(fourthBut);
        this.add(valulabel);

        Click2Listener listen = new Click2Listener(this);
        firstBut.addActionListener(listen);
        secondBut.addActionListener(listen);
        thirddBut.addActionListener(listen);
        fourthBut.addActionListener(listen);

    }

    public void setValue(String value)
    {
        model2.setValue(value);
        valulabel.setText("Clicked Button : "+model2.getValue());
    }
}
