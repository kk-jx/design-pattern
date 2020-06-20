package com.kk.dp.test;

import com.kk.dp.service.Context;
import com.kk.dp.service.impl.StrategyA;
import com.kk.dp.service.impl.StrategyB;

/**
 * Created by kk on 2017/10/29.
 */
public class StrategyTest {

    public static void main(String[] args){
        Context context = null;

        context = new Context(new StrategyA());
        context.contextInterface();

        context = new Context(new StrategyB());
        context.contextInterface();

    }

}
