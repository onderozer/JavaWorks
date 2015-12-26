package com.java.GUI.BasicGUI.Menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dedeHan on 20.12.2015.
 */
public class MenuListener implements ActionListener{

    private MenuFrame menuFrame;

    public MenuListener(MenuFrame mf) {
        menuFrame = mf;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if (actionCommand.equals("Item 1")) {
            menuFrame.setText("Item 1 Selected");
        } else if (actionCommand.equals("Exit")) {
            System.exit(1);
        } else if (actionCommand.equals("Enable Test")) {
            menuFrame.enableTest();
            menuFrame.setText("Item \"Test\" in Menu 1 enabled");
        } else if (actionCommand.equals("Disable Test")) {
            menuFrame.disableTest();
            menuFrame.setText("Item \"Test\" in Menu 1 disabled.");
        }
        else {
            System.out.println("Error :") ;
        }
    }
}
