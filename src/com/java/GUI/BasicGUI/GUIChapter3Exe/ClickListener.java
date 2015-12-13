package com.java.GUI.BasicGUI.GUIChapter3Exe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dedeHan on 13.12.2015.
 */
public class ClickListener implements ActionListener {

    ClickPanel clickP;
    public ClickListener(ClickPanel panel)
    {
        clickP = panel;
    }

    public void actionPerformed(ActionEvent evt)
    {
        String actionCommand = evt.getActionCommand();

        if(actionCommand.equals("1"))
        {
            clickP.setValue("1");
        }

        else if(actionCommand.equals("2"))
        {
            clickP.setValue("2");
        }

        else if(actionCommand.equals("3"))
        {
            clickP.setValue("3");
        }

        else if(actionCommand.equals("4"))
        {
            clickP.setValue("4");
        }

        else
        {
            System.out.print("Error :");
        }

    }
}
