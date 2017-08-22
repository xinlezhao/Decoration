package com.xinle.kotlin

import java.nio.channels.SocketChannel

/**
 * Created by xinle on 7/15/17.
 */


fun main(args: Array<String>) {
   printFoo(D())
}







open class C

class D: C()

fun C.foo() = "c"

fun D.foo() = "d"


suspend  fun   doSomething(){











}



fun  sun(a: Int, b: Int) = a + b;



fun printFoo(c: C){
    println(c.foo())
}





