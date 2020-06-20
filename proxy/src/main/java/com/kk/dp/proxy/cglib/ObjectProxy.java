package com.kk.dp.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * Created by kk on 2020/6/18.
 */
public class ObjectProxy {

    public static Object createProxy(Object target, MethodInterceptor methodInterceptor){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(methodInterceptor);
        return enhancer.create();
    }

}
