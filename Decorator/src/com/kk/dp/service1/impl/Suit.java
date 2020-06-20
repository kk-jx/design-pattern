package com.kk.dp.service1.impl;

import com.kk.dp.service1.Finery;
import com.kk.dp.service1.Person;

/**
 * Created by kk on 2017/11/7.
 */
public class Suit extends Finery {

    public Suit(Person person){
        super(person);
    }

    public void wearSuit(){
        System.out.println("穿西服");
    }

    @Override
    public void dress() {
        super.dress();
        this.wearSuit();
    }
}
