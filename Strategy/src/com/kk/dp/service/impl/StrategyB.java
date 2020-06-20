package com.kk.dp.service.impl;

import com.kk.dp.service.Strategy;

/**
 * Created by kk on 2017/10/29.
 */
public class StrategyB implements Strategy {
    /**
     * 算法实现
     *
     * @return
     */
    @Override
    public void algorithmInterface() {
        System.out.println("策略算法B的实现");
    }
}
