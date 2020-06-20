package com.kk.dp.service;

import com.kk.dp.service.impl.OperationAdd;
import com.kk.dp.service.impl.OperationSub;

/**
 * Created by kk on 2017/10/20.
 */
public class Factory {

    public static OperationImp createOperation(String flag){
        OperationImp operation = null;
        switch (flag){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            default:break;
        }
        return operation;
    }

}
