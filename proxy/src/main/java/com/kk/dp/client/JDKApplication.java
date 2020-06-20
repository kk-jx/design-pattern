package com.kk.dp.client;

import com.kk.dp.proxy.jdk.ObjectInvocationHandler;
import com.kk.dp.proxy.jdk.ObjectProxy;
import com.kk.dp.service.Action;
import com.kk.dp.service.PrintInfoEvent;
import com.kk.dp.service.WriteAction;

import java.lang.reflect.InvocationHandler;

/**
 * Created by kk on 2020/6/17.
 */
public class JDKApplication {

    public static void main(String[] args) {
        InvocationHandler h = new ObjectInvocationHandler(new WriteAction(),new PrintInfoEvent(),null);
        Action action = (Action)ObjectProxy.createProxy(new WriteAction("aaaa"), h);
        action.handle("你好");
    }

}
