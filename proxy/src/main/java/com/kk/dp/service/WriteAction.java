package com.kk.dp.service;

/**
 * Created by kk on 2020/6/17.
 */
public class WriteAction implements Action {

    private Object param;

    public WriteAction() {
    }

    public WriteAction(Object param) {
        this.param = param;
    }

    @Override
    public Object handle(Object ...mps) {
        for (Object mp:mps) {
            System.out.print("handle method param is "+mp.toString()+" ");
        }
        System.out.println();
        if (param==null){
            System.out.println("handle method is execed-->null");
            return null;
        }
        System.out.println("handle is execed-->"+param.toString());
        return param.toString();
    }

    @Override
    public Object fill() {
        if (param==null){
            System.out.println("fill method is execed-->null");
            return null;
        }
        System.out.println("fill method is execed-->"+param.toString());
        return param.toString();
    }
}
