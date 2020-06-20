package com.kk.dp.service;

import com.kk.dp.service.impl.StrategyA;
import com.kk.dp.service.impl.StrategyB;

/**
 * Created by kk on 2017/10/29.
 */
public class ContextUpgrade {
    private Strategy strategy;

    public ContextUpgrade(String type){
        switch (type){
            case "a":
                strategy = new StrategyA();
                break;
            case "b":
                strategy = new StrategyB();
                break;
            default:;
        }
    }

    public void contextInterface(){
        strategy.algorithmInterface();
    }

}
