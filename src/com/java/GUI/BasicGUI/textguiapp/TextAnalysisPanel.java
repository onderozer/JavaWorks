package com.java.GUI.BasicGUI.textguiapp;

import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;

/**
 * Created by dedeHan on 16.12.2015.
 */
public class TextAnalysisPanel extends JPanel{

    private JLabel lastTextLabel;
    private JLabel numberOfEsLabel;
    private JLabel numberOfTextsLabel;
    private JTextField inputField;
    private TextAnalysisModel analysisModel;

    public TextAnalysisPanel()
    {
        analysisModel = new TextAnalysisModel();

        this.setBackground(Color.yellow);
        this.setLayout(new GridLayout(4,2,10,10));
        JLabel questionLabel = new JLabel("Enter Text :");
        JLabel replyLabel = new JLabel("Current text :");
        JLabel numberTextLabel = new JLabel("No E in current text:");
        JLabel totalNumberOfText = new JLabel("Total Number of Text :");
        lastTextLabel = new JLabel("");
        numberOfEsLabel = new JLabel("--");
        inputField = new JTextField("");
        numberOfTextsLabel = new JLabel("");

        questionLabel.setOpaque(true);
        questionLabel.setBackground(Color.black);
        questionLabel.setForeground(Color.white);

        replyLabel.setOpaque(true);
        replyLabel.setBackground(Color.black);
        replyLabel.setForeground(Color.white);

        numberOfEsLabel.setOpaque(true);
        numberOfEsLabel.setBackground(Color.red);
        numberOfEsLabel.setForeground(Color.white);

        lastTextLabel.setOpaque(true);
        lastTextLabel.setBackground(Color.red);
        lastTextLabel.setForeground(Color.white);

        numberOfTextsLabel.setOpaque(true);
        numberOfTextsLabel.setBackground(Color.red);
        numberOfTextsLabel.setForeground(Color.white);

        this.add(questionLabel);
        this.add(inputField);
        this.add(replyLabel);
        this.add(lastTextLabel);
        this.add(numberTextLabel);
        this.add(numberOfEsLabel);
        this.add(totalNumberOfText);
        this.add(numberOfTextsLabel);
    }

    public void startAnalysisAndDisplay()
    {
        String text = inputField.getText();
        analysisModel.analyse(text);
        lastTextLabel.setText(analysisModel.getCurrentText());
        int noOfEs = analysisModel.getCurrentNumberOfEs();
        numberOfEsLabel.setText(Integer.toString(noOfEs));
        numberOfTextsLabel.setText(Integer.toString(analysisModel.getTotalNumberOfTexts()));
        inputField.setText("");
    }

    public void resetText()
    {
        analysisModel.reset();
        numberOfEsLabel.setText(Integer.toString(analysisModel.getCurrentNumberOfEs()));
        numberOfTextsLabel.setText(Integer.toString(analysisModel.getTotalNumberOfTexts()));
        lastTextLabel.setText("");
    }
}
