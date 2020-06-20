package com.kk.dp.proxy;

/**
 * Created by kk on 2020/6/17.
 */
public interface ActionAroundEvent {

    Object[] getExecParams();

    void exec(Object ...obj);
}
