package com.kk.dp.service;

/**
 * Created by kk on 2017/10/20.
 */
public abstract class OperationImp implements Operation {
    protected double numberA = 0;
    protected double numberB = 0;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}
