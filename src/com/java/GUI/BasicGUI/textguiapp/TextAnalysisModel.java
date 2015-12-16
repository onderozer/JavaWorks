package com.java.GUI.BasicGUI.textguiapp;

/**
 * Created by dedeHan on 16.12.2015.
 */
public class TextAnalysisModel {

    private int totalNumberOfEs;
    private int currentNumberOfEs;
    private int totalNumberOfTexts;
    private String currentText;

    public TextAnalysisModel() {
        totalNumberOfEs = 0;
        totalNumberOfTexts = 0;
        currentText = "";
    }

    public void analyse(String str)
    {
        currentText = str.toUpperCase();
        currentNumberOfEs = 0;
        totalNumberOfTexts = str.length();

        for (int i = 0; i < currentText.length(); i++) {
            if (currentText.charAt(i) == 'E')
            {
                currentNumberOfEs++;
            }
        }
    }

    public void reset()
    {
        currentNumberOfEs = 0;
        totalNumberOfTexts = 0;
    }

    public int getTotalNumberOfEs() {
        return totalNumberOfEs;
    }

    public int getCurrentNumberOfEs() {
        return currentNumberOfEs;
    }

    public int getTotalNumberOfTexts() {
        return totalNumberOfTexts;
    }

    public String getCurrentText() {
        return currentText;
    }

}
