package com.java.GUI.BasicGUI.GUIChapter3Exe2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dedeHan on 13.12.2015.
 */
public class Click2Listener implements ActionListener {

    private ClickPanel2 panel;

    public Click2Listener(ClickPanel2 pan)
    {
        panel = pan;
    }

    public void actionPerformed(ActionEvent evt)
    {
        String actionCommand = evt.getActionCommand();

        if(actionCommand.equals("1"))
        {
            panel.setValue("1");
        }

        else if(actionCommand.equals("2"))
        {
            panel.setValue("2");
        }

        else if(actionCommand.equals("3"))
        {
            panel.setValue("3");
        }

        else if(actionCommand.equals("4"))
        {
            panel.setValue("4");
        }

        else
        {
            System.out.println("Error :");
        }
    }
}
