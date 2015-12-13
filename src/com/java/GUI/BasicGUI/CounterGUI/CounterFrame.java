package com.java.GUI.BasicGUI.CounterGUI;

import com.java.GUI.BasicGUI.SimpleFrame.SimpleFrame;

import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by dedeHan on 13.12.2015.
 */
public class CounterFrame extends SimpleFrame{

    public CounterFrame()
    {

        GridLayout lay = new GridLayout(2,1);
        this.setLayout(lay);

        CounterPanel counterPane = new CounterPanel();
        CounterPanel counterPane2 = new CounterPanel();

        this.getContentPane().add(counterPane);
        this.getContentPane().add(counterPane2);
    }
}
