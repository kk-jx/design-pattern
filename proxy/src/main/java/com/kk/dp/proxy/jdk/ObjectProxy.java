package com.kk.dp.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by kk on 2020/6/17.
 */
public class ObjectProxy {

    public static Object createProxy(Object target, InvocationHandler invocationHandler){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),invocationHandler);
    }

}
