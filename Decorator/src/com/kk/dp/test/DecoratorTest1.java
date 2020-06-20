package com.kk.dp.test;

import com.kk.dp.service1.Finery;
import com.kk.dp.service1.Person;
import com.kk.dp.service1.impl.Shirt;
import com.kk.dp.service1.impl.Suit;;

/**
 * Created by kk on 2017/11/7.
 */
public class DecoratorTest1 {

    public static void main(String[] args){
        Person person = new Person();
        Person shirt = new Shirt(person);
        Person suit = new Suit(shirt);
        suit.dress();
    }

}
