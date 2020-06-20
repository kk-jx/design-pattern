package com.kk.dp.test;

import com.kk.dp.service.Human;
import com.kk.dp.service.impl.Man;
import com.kk.dp.service.impl.People;
import com.kk.dp.service.impl.Person;
import com.kk.dp.service.impl.Woman;

/**
 * Created by kk on 2017/11/7.
 */
public class DecoratorTest {

    public static void main(String[] args){
        Human human = new Person();
        Human pHuman = new People(human);
        Human mHuman = new Man(pHuman);
        Human wHuman = new Woman(mHuman);
        wHuman.eat();
    }

}
