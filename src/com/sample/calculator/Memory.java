package com.sample.calculator;

/**
 * Created by Arnaud on 1/4/2015.
 */
public class Memory {

    private String mLeftOperand;

    private String mOperator;

    private String mRightOperand;

    public Memory(){

    }

    public void storeLeftOperand(String leftOperand){
        this.mLeftOperand = leftOperand;
    }

    public void storeOperator(String operator){
        this.mOperator = operator;
    }

    public void storeRightOperand(String rightOperand){
        this.mRightOperand = rightOperand;
    }

    public String getLeftOperand(){
        return this.mLeftOperand;
    }

    public String getRightOperand(){
        return this.mRightOperand;
    }

    public String getOperator(){
        return this.mOperator;
    }
}
