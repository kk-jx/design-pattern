package com.kk.dp.service1.impl;

import com.kk.dp.service1.Finery;
import com.kk.dp.service1.Person;

/**
 * Created by kk on 2017/11/7.
 */
public class Shirt extends Finery {

    public Shirt(Person person){
        super(person);
    }

    public void wearShirt(){
        System.out.println("穿衬衫");
    }

    @Override
    public void dress(){
        super.dress();
        wearShirt();
    }
}
