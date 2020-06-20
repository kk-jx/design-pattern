package com.kk.dp.service;

/**
 * Created by kk on 2020/6/18.
 */
public class SpecialAction {

    public Object doAction(Object ...params){
        System.out.println("===SpecialAction class  method doAction==");
        return null;
    }

    public final Object add(){
        System.out.println("===SpecialAction class  method add===");
        return null;
    }

}
