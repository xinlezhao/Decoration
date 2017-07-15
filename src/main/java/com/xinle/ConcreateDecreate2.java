package com.xinle;

/**
 * Created by xinle on 7/15/17.
 */
public class ConcreateDecreate2 extends DecreateComponet {
    public ConcreateDecreate2(Componet componet) {
        super(componet);
    }


    @Override
    public void doSomething() {
        super.doSomething();
        doAntherThing();
    }


    private void doAntherThing(){

        System.out.println("doAndthingC");


    }


}
