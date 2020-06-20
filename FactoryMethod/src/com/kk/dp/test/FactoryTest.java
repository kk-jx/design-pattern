package com.kk.dp.test;

import com.kk.dp.service.Factory;
import com.kk.dp.service.Operation;
import com.kk.dp.service.OperationImp;

/**
 * Created by kk on 2017/10/20.
 */
public class FactoryTest {
    public static void main(String[] arg){
        OperationImp operationImpAdd = Factory.createOperation("+");
        operationImpAdd.setNumberA(1);
        operationImpAdd.setNumberB(2);
        System.out.println(operationImpAdd.result());

        OperationImp operationImpSub = Factory.createOperation("-");
        operationImpSub.setNumberA(78);
        operationImpSub.setNumberB(67);
        System.out.println(operationImpSub.result());
    }
}
