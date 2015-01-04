package com.sample.calculator;

import javax.swing.*;

/**
 * Created by Arnaud on 1/4/2015.
 */
public class Display extends JTextField {

    public Display() {
        this.setEditable(false);
        this.setText("0");
    }

    public void appendText(String text){
        String buffer = this.getText();
        this.setText(buffer + text);
    }
}
