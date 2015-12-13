package com.java.GUI.BasicGUI.SimpleFrame;

/**
 * Created by dedeHan on 13.12.2015.
 */
public class SimpleFrameDriver {

    public static void main(String[] args) {

        SimpleFrame sFrame1 = new SimpleFrame();
        SimpleFrame sFrame2 = new SimpleFrame();
        sFrame1.showIt("Simple Frame 1");
        sFrame2.showIt("Simple Frane 2",300,150);
    }
}
