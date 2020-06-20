package com.kk.dp.client;

import com.kk.dp.proxy.cglib.ActionMethodInterceptor;
import com.kk.dp.proxy.cglib.ObjectProxy;
import com.kk.dp.service.PrintInfoEvent;
import com.kk.dp.service.SpecialAction;

/**
 * Created by kk on 2020/6/18.
 */
public class CGLIBApplication {

    public static void main(String[] args) {
        SpecialAction proxy = (SpecialAction)ObjectProxy.createProxy(new SpecialAction(), new ActionMethodInterceptor(new PrintInfoEvent(),null));
        proxy.doAction();
    }

}
