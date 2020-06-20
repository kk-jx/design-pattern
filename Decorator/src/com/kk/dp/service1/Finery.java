package com.kk.dp.service1;

/**
 * 这里继承Person的作用是后续（测试）调用方法的时候能够使用同一类型
 * 这里给装饰类赋值除了构造方法还可以利用set方法
 * Created by kk on 2017/11/7.
 */
public class Finery extends Person {
    private Person person;
    public Finery(Person person){
        this.person = person;
    }

    public void dress(){
        /*装饰父类中的装饰一定是调用被装饰方法*/
        person.dress();
    }

}
