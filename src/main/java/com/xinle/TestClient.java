package com.xinle;

/**
 * Created by xinle on 7/15/17.
 */
public class TestClient {

    public static void main(String[] args) {

        Componet componet = new ConcreateComponet();

        Componet componet1 = new ConcreateDecrete(componet);

        Componet componet2 = new ConcreateDecreate2(componet1);

        componet2.doSomething();


    }


}
