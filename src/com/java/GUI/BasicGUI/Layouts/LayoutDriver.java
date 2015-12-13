package com.java.GUI.BasicGUI.Layouts;

import java.awt.FlowLayout;
import java.awt.GridLayout;

/**
 * Created by dedeHan on 13.12.2015.
 */
public class LayoutDriver {

    public static void main(String[] args) {

        FlowLayout flow1 = new FlowLayout();
        LayoutFrame flow1Frame = new LayoutFrame(flow1);
        flow1Frame.showIt("Flow 1",60,60);
/*
        FlowLayout flow2 = new FlowLayout(FlowLayout.LEFT,1000,20);
        LayoutFrame flow2Frame = new LayoutFrame(flow1);
        flow2Frame.showIt("Flow 2",300,60);

        GridLayout grid1 = new GridLayout(2,4);
        LayoutFrame gridFrame = new LayoutFrame(grid1);
        gridFrame.showIt("Grid Frame",540,60);
*/
    }
}
