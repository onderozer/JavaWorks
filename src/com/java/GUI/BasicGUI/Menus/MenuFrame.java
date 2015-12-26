package com.java.GUI.BasicGUI.Menus;

import com.java.GUI.BasicGUI.SimpleFrame.SimpleFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by dedeHan on 20.12.2015.
 */
public class MenuFrame extends SimpleFrame{

    private JLabel display;
    private JMenuItem testItem;

    public MenuFrame() {

        display = new JLabel("No menu selected", JLabel.CENTER);

        JMenuBar menubar = new JMenuBar();
        this.setJMenuBar(menubar);

        JMenu firstMenu = new JMenu("Menu 1");
        JMenu secondMenu = new JMenu("Menu 2");
        menubar.add(firstMenu);
        menubar.add(secondMenu);

        JMenuItem firstItem = new JMenuItem("Item 1");
        testItem = new JMenuItem("Test");
        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem enableItem = new JMenuItem("Enable Test");
        JMenuItem disableItem = new JMenuItem("Disable Test");

        firstMenu.add(firstItem);
        firstMenu.add(testItem);
        firstMenu.addSeparator();
        firstMenu.add(exitItem);

        secondMenu.add(enableItem);
        secondMenu.add(disableItem);

        MenuListener menuList = new MenuListener(this);
        firstItem.addActionListener(menuList);
        testItem.addActionListener(menuList);
        exitItem.addActionListener(menuList);
        enableItem.addActionListener(menuList);
        disableItem.addActionListener(menuList);

        this.getContentPane().add(display, BorderLayout.CENTER);
    }
        public void setText(String str)
        {
            display.setText(str);
        }

        public void enableTest()
        {
            testItem.setEnabled(true);
        }

        public void disableTest()
        {
            testItem.setEnabled(false);
        }

}
