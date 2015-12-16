package com.java.GUI.BasicGUI.textcolorChanger;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dedeHan on 16.12.2015.
 */
public class ColorChangeListener implements ActionListener{

    private ColorChangerPanel cPanel;

    public ColorChangeListener(ColorChangerPanel cp) {
        cPanel = cp;
    }

    public void actionPerformed(ActionEvent evt)
    {
        String actionCommand = evt.getActionCommand();

        if (actionCommand.equals("Red")) {
            cPanel.changeTextColor(Color.red);
        }

        else if (actionCommand.equals("Yellow")) {
            cPanel.changeTextColor(Color.yellow);
        }

        else if (actionCommand.equals("Green")) {
            cPanel.changeTextColor(Color.green);
        }
    }
}
