package com.kk.dp.proxy.cglib;

import com.kk.dp.proxy.ActionAroundEvent;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by kk on 2020/6/18.
 */
public class ActionMethodInterceptor implements MethodInterceptor {

    private ActionAroundEvent headEvent;
    private ActionAroundEvent tailEvent;

    public ActionMethodInterceptor() {
    }

    public ActionMethodInterceptor(ActionAroundEvent headEvent, ActionAroundEvent tailEvent) {
        this.headEvent = headEvent;
        this.tailEvent = tailEvent;
    }

    /**
     *
     * @param target 目标对象
     * @param method 目标对象方法
     * @param args 目标对象参数
     * @param methodProxy 代理对象
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if (headEvent!=null){
            headEvent.exec(headEvent.getExecParams());
        }
        System.out.println("--------------------------cglib proxied object exec start-----------------------------");
        //cglib不是用的反射做代理
        Object result = methodProxy.invokeSuper(target, args);
        System.out.println("--------------------------cglib proxied object exec end-----------------------------");
        if (tailEvent!=null){
            tailEvent.exec(tailEvent.getExecParams());
        }
        return result;
    }
}
