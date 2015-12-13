package com.java.GUI.BasicGUI.countergudeneme;

import com.java.GUI.BasicGUI.SimpleFrame.SimpleFrame;

import java.awt.*;

/**
 * Created by dedeHan on 13.12.2015.
 */
public class CounterFrame2 extends SimpleFrame {

    public CounterFrame2()
    {
        CounterPanel2 coun2 = new CounterPanel2();
        this.getContentPane().add(coun2, BorderLayout.CENTER);
    }


}
