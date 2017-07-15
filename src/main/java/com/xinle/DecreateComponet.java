package com.xinle;

/**
 * Created by xinle on 7/15/17.
 */
public class DecreateComponet implements Componet {

    Componet componet;


    public DecreateComponet(Componet componet) {
        this.componet = componet;
    }

    @Override
    public void doSomething() {
        this.componet.doSomething();
    }



}
