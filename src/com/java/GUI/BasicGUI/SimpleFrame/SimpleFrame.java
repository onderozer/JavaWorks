package com.java.GUI.BasicGUI.SimpleFrame;

import javax.swing.*;

/**
 * Created by dedeHan on 13.12.2015.
 */
public class SimpleFrame extends JFrame {

    public SimpleFrame(){

        this.setSize(200,200);
        this.setLocation(200,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Makes Frame Visible
    public void showIt()
    {
        this.setVisible(true);
    }

    //MAke the frame visible and sets the title bar
    public void showIt(String title)
    {
        this.setTitle(title);
        this.setVisible(true);
    }

    /*
    Makes frame visible and sets the title text
    and the position of the window
     */
    public void showIt(String title, int x, int y)
    {
        this.setTitle(title);
        this.setLocation(x,y);
        this.setVisible(true);
    }

    //Makes frame invisible
    public void hideIt()
    {
        this.setVisible(false);
    }

}
