package com.kk.dp.service;

import com.kk.dp.proxy.ActionAroundEvent;

/**
 * Created by kk on 2020/6/17.
 */
public class PrintInfoEvent implements ActionAroundEvent {
    private String p =  "参数测试001";

    public Object[] getExecParams() {
        return new Object[]{p};
    }

    public void exec(Object... obj) {
        int i = 1;
        for (Object o:obj) {
            System.out.print("代理对象前的操作：第"+i+"个参数:"+o.toString()+" ");
            i++;
        }
        System.out.println();
    }
}
