package com.kk.dp.proxy.jdk;

import com.kk.dp.proxy.ActionAroundEvent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by kk on 2020/6/17.
 */
public class ObjectInvocationHandler implements InvocationHandler {

    private ActionAroundEvent headEvent;
    private ActionAroundEvent tailEvent;
    private Object target;  //被代理对象（目标对象）

    public ObjectInvocationHandler(Object target) {
        this.target = target;
    }

    public ObjectInvocationHandler(Object target,ActionAroundEvent headEvent, ActionAroundEvent tailEvent) {
        this.target = target;
        this.headEvent = headEvent;
        this.tailEvent = tailEvent;
    }

    /**
     *
     * @param proxy 代理对象
     * @param method 代理方法
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (headEvent!=null){
            headEvent.exec(headEvent.getExecParams());
        }
        System.out.println("--------------------------jdk proxied object exec start-----------------------------");
        Object result = method.invoke(target, args);
        System.out.println("--------------------------jdk proxied object exec end-----------------------------");
        if (tailEvent!=null){
            tailEvent.exec(tailEvent.getExecParams());
        }
        return result;
    }
}
