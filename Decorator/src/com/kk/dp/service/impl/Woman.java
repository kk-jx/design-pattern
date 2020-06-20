package com.kk.dp.service.impl;

import com.kk.dp.service.Human;

/**
 * Created by kk on 2017/11/7.
 */
public class Woman extends People {
    public Woman(Human human) {
        super(human);
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("吃水果");
    }
}
