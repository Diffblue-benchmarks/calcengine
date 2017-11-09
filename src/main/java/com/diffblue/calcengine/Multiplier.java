package com.diffblue.calcengine;

public class Multiplier extends CalculateBase implements MathProcessing {
    public Multiplier () {}
    public Multiplier(double leftVal, double rightVal) {
        super(leftVal,rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() * getRightVal();
        setResult(value);
    }

    @Override
    public String getKeyword() {
        return "multiply";
    }

    @Override
    public char getSymbol() {
        return '*';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();

        return getResult();
    }
}
