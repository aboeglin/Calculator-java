package com.sample.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Arnaud on 1/4/2015.
 */
public class Calculator extends JFrame implements ActionListener{

    private Button[] mButtons;

    private Display mDisplay;

    private Processor mProcessor;

    private JPanel mBottomPanel;
    private JPanel mTopPanel;

    public Calculator(){

        this.mButtons = new Button[16];

        this.mTopPanel = new JPanel();
        this.mTopPanel.setSize(100, 50);
        this.mBottomPanel = new JPanel();

        GridLayout gl = new GridLayout(4, 4);

        this.mBottomPanel.setLayout(gl);

        this.mTopPanel.setLayout(new BorderLayout());

        this.setLayout(new GridLayout(2, 1));

        this.initDisplay();
        this.initButtons();


        this.add(this.mTopPanel);
        this.add(this.mBottomPanel);

        this.mProcessor = new Processor(this.mDisplay);

    }

    public void initDisplay(){
        this.mDisplay = new Display();
        this.mTopPanel.add(this.mDisplay);
    }

    public void initButtons(){
        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] operators = {"+", "-", "*", "/", "=", "C"};

        for(int i=0; i<digits.length; i++){
            this.mButtons[i] = new Button(digits[i]);
        }

        for(int i=0; i<operators.length; i++){
            this.mButtons[i+10] = new Button(operators[i]);
        }

        for(int i=0; i<this.mButtons.length; i++){
            this.mBottomPanel.add(this.mButtons[i]);
            this.mButtons[i].addActionListener(this);
        }
    }

    /**
     * gathers the keyPressed events, extracts the button value
     * and asks the processor to do something with it.
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonValue = ((Button)e.getSource()).getText();
        this.mProcessor.process(buttonValue);
    }
}
