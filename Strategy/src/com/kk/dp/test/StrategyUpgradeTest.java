package com.kk.dp.test;

import com.kk.dp.service.ContextUpgrade;

/**
 * Created by kk on 2017/10/29.
 */
public class StrategyUpgradeTest {
    public static void main(String[] args){
        ContextUpgrade context = null;
        context = new ContextUpgrade("a");
        context.contextInterface();

        context = new ContextUpgrade("b");
        context.contextInterface();
    }
}
