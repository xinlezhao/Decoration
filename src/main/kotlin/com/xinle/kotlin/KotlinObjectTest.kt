package com.xinle.kotlin

/**
 * Created by xinle on 7/15/17.
 */
object KotlinObjectTest {
}


fun hello() {

}


interface Clickable {
    fun click()
    fun showOff() {
        println("showOf inovked!");
    }
}


interface Focusable {

    fun setFocusable(b: Boolean) {
        println("I ${if (b) "got" else "lost"} focus.")
    }

    fun showOff() = println("I'm focusable!")

}


class Button : Clickable, Focusable {
    override fun click() {
        showOff()
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }

}


sealed class Exper {

    class Number(val value: Int) : Exper()

    class Sumber(val left: Int, val right: Int) : Exper()

}


fun eval(e: Exper): Int {

    when (e) {

        is Exper.Number -> return e.value

        is Exper.Sumber -> return e.left + e.right

    }
}


class User2(val name: String) {

    var address: String = "unspcified"
        set(value: String) {

            field = value
        }
}


class Persons(val name: String, val age: Int)


val people = listOf(Persons("lisa", 26), Persons("Nick", 27))


fun filterTest(): List<Persons> {

    val numbers = mapOf(1 to "one", 2 to "two")


    val list = listOf("hello", "welcome", "world")

    list.groupBy(String::first)

    numbers.mapValues { it.value.toUpperCase() }


    return people.filter { it.age > 26 }
}


fun test3() {

    createAllDoneRunable().run()

}


fun createAllDoneRunable(): Runnable {

    return Runnable { println("All Done") }

}


fun alphabet(): String {


    val result = StringBuilder()

    for (letter in 'A'..'Z') {
        result.append(letter)
    }


    result.append("\nNow I know the alphabet!")


    return result.toString()


}


fun alphabet2(): String {

    val result = StringBuilder()
    return with(result) {
        for (letter in 'A'..'X') {
            this.append(letter)
        }
        append("\nNow I know the alphabet!")
        toString()
    }
}

fun alphabet3(): String {

    return StringBuilder().apply {
        for (letter in 'A'..'Z') {
            append(letter)
        }
        append("\n Now I know the alphabet")
    }.toString()

}






















