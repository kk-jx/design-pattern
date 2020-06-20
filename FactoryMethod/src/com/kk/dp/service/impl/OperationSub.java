package com.kk.dp.service.impl;

import com.kk.dp.service.Operation;
import com.kk.dp.service.OperationImp;

/**
 * Created by kk on 2017/10/19.
 */
public class OperationSub extends OperationImp {
    @Override
    public double result() {
        return numberA-numberB;
    }
}
