package com.kk.dp.service.impl;

import com.kk.dp.service.Human;

/**
 * Created by kk on 2017/11/7.
 */
public class People implements Human {
    private Human human;

    public People(Human human){
        this.human = human;
    }

    /**
     * 原始人吃东西
     */
    @Override
    public void eat() {
        human.eat();
    }
}
