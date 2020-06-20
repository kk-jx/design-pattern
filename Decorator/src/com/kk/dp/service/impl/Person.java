package com.kk.dp.service.impl;

import com.kk.dp.service.Human;

/**
 * Created by kk on 2017/11/7.
 */
public class Person implements Human {
    /**
     * 普通人喝水
     */
    @Override
    public void eat() {
        System.out.println("喝水");
    }
}
