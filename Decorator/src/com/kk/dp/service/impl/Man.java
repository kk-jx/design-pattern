package com.kk.dp.service.impl;

import com.kk.dp.service.Human;

/**
 * Created by kk on 2017/11/7.
 */
public class Man extends People {

    public Man(Human human){
        super(human);
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("吃饭");
    }
}
