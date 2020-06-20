package com.kk.dp.service;

/**
 * 策略配置上下文类
 * Created by kk on 2017/10/29.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.algorithmInterface();
    }

}
