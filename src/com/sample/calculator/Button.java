package com.sample.calculator;

import javax.swing.*;

/**
 * Created by Arnaud on 1/4/2015.
 */
public class Button extends JButton{

    private String mValue;

    public Button(String value){
        this.mValue = value;
        this.setText(value);
    }

}
