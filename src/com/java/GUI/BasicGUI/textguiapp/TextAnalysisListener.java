package com.java.GUI.BasicGUI.textguiapp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dedeHan on 16.12.2015.
 */
public class TextAnalysisListener implements ActionListener{

    private TextAnalysisPanel taPanel;

    public TextAnalysisListener(TextAnalysisPanel t) {
        taPanel = t;
    }

    public void actionPerformed(ActionEvent evt)
    {
        String actionCommand = evt.getActionCommand();

        if(actionCommand.equals("Analyse"))
        {
            taPanel.startAnalysisAndDisplay();
        }

        else if (actionCommand.equals("Reset"))
        {
            taPanel.resetText();
        }
    }
}
