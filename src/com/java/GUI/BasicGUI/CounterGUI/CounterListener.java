package com.java.GUI.BasicGUI.CounterGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dedeHan on 13.12.2015.
 */
public class CounterListener implements ActionListener{

    private CounterPanel counterPane;

    public CounterListener(CounterPanel counp)
    {
        counterPane = counp;
    }

    public void actionPerformed(ActionEvent evt)
    {
        String actionCommand = evt.getActionCommand();
        if(actionCommand.equals("UP"))
        {
            counterPane.increment();
        }

        else if(actionCommand.equals("DOWN"))
        {
            counterPane.decrement();
        }

        else if(actionCommand.equals("RESET"))
        {
            counterPane.reset();
        }

        else
        {
            System.out.print("Error : command is failed");
        }
    }
}
