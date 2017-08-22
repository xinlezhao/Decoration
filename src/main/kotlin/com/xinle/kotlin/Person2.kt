package com.xinle.kotlin

class Person2 internal constructor(var name: String)


class Rectangle(val height: Int, val width: Int){

    var isSquare: Boolean
    get() {
        return height == width
    }

    set(value) {
        isSquare = value
    }


}
