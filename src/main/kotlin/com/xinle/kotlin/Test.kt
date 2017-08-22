package com.xinle.kotlin

class Test {


    var name: String = "test"

    val hello: String = "hello"



    fun main(args: Array<String>){

        println(sun(2,5))

        yellAt(Person(null))

    }

    fun sun(a: Int, b: Int): Int{

        return a + b;
    }


    fun yellAt(person: Person){
        println(person.name)
    }




}