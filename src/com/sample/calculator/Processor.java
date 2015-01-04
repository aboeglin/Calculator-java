package com.sample.calculator;

/**
 * Created by Arnaud on 1/4/2015.
 */
public class Processor {

    private Memory mMemory;

    private Display mDisplay;

    /**
     * Constructor
     */
    public Processor(Display d){
        this.mDisplay = d;
        this.mMemory = new Memory();
    }

    /**
     * processing the button pressed
     *
     * @param value
     */
    public void process(String value){
        this.mDisplay.appendText(value);

        if(this.isDigit(value)){
            this.addDigitToMemory(value);
        }
    }

    private void addDigitToMemory(String digit){

    }

    /**
     * TODO
     * @param value
     * @return
     */
    private boolean isDigit(String value){
        return false;
    }

    /**
     * TODO
     * @param value
     * @return
     */
    private boolean isOperator(String value){
        return false;
    }

    private void calculate(){
        String left = this.mMemory.getLeftOperand();
        String right = this.mMemory.getRightOperand();
        String operator = this.mMemory.getOperator();
    }

}
