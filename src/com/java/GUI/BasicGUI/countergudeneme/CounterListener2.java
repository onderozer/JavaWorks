package com.java.GUI.BasicGUI.countergudeneme;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dedeHan on 13.12.2015.
 */
public class CounterListener2 implements ActionListener {

    private CounterPanel2 countP;

    public CounterListener2(CounterPanel2 counterPanel2)
    {
        countP = counterPanel2;
    }

    public void actionPerformed(ActionEvent evt)
    {
        String actionCommand = evt.getActionCommand();

        if(actionCommand.equals("UP"))
        {
            countP.increment();
        }

        else if(actionCommand.equals("DOWN"))
        {
            countP.decrement();
        }
        else
        {
            System.out.print("Error: missing action");
        }
    }
}
