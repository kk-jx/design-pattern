package com.kk.dp.service;

/**
 * Created by kk on 2020/6/17.
 */
public interface Action {

    Object handle(Object ...mps);

    Object fill();

}
