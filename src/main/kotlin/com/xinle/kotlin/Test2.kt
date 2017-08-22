package com.xinle.kotlin

import java.io.BufferedReader
import java.util.*
import kotlin.IllegalArgumentException

val email: String? = null
fun hello(x: Int, y: Int) = x + y


fun main(array: Array<String>) {
//    println(hello(3, 5))
//
////    printHashCode("")
//
//
//    println(getMnemonic(Color.VIOLET))
//
//    println(Color.BLUE.rgb())
//
//    test()


    val list = listOf(1, 2, 3)

    println(joinToString(list, ":", "(", ")"))



//    yellAt(Person(null))
}

fun sendEmail(email: String) {
    println(email)
}

fun ignoreNull(s: String) {
    println(s.length)
    email?.let { sendEmail(it) }
}

fun <T : Any> printHashCode(t: T) {
    println(t.hashCode())
    

}

fun yellAt(person: Person) {
    println(person.name.toUpperCase())
}

fun max(a: Int, b: Int): Int = if(a > b) a else b




enum class ColorTest{
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}


enum class Color(val r: Int, val g: Int, val b: Int){
    RED(255, 0, 0), ORANGE(255, 165, 0), YELLOW(255, 255, 0),
    GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);


    fun rgb() = (r * 265 + g) * 256 + b

}

fun getMnemonic(color: Color) = when(color){
    Color.RED -> "Richard"
    Color.ORANGE -> "Of"
    Color.YELLOW -> "York"
    Color.GREEN -> "Gave"
    Color.BLUE -> "Battle"
    Color.INDIGO -> "In"
    Color.VIOLET -> "Vain"


}


interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr



fun  test(){
    val temp = 1..100
    for(c in temp){

        println(c)
    }

    mapTest()
}


fun mapTest(){

    val binaryReps = TreeMap<Char, String>()

    for(c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for((letter, binary) in binaryReps){
        println("$letter = $binary")
    }
    listWithIndext()
}

fun listWithIndext(){

    val list = arrayListOf("10", "11", "1001")

    for((indext, element) in list.withIndex()){
        println("$indext : $element")
    }

}




fun isLetter(c: Char): Boolean{
    return c in 'a'..'z' || c in 'A'..'Z'
}


fun isNotDigit(c: Char, d: Int): Boolean{

    if(d !in 0..100){
        throw IllegalArgumentException("A percentage value must be between 0 and 100: $d")
    }
    val percentag = if(d in 0..100)
        d
    else
        throw IllegalArgumentException("A percentage value must be between 0 and 100: $d")

    println("Kotlin" in setOf("Java", "Scala"))

    return c !in '0'..'9'
}


fun recognize(c: Char) = when (c){

    in '0'..'9' -> "It is a digit"
    in 'a'..'z', in 'A'..'Z' -> "It is a letter"
    else -> "I don't konw"
}


fun readNumber(reader: BufferedReader): Int?{

    val list = setOf(1, 2)
    val map = hashMapOf(1 to "one", 2 to "two ", 3 to "three")

    for((key, value) in map){
        println("$key : $value")
    }

    val list2 = listOf("first", "second", "third", "fourteenth")

    joinToString(separator = "|", collection = list2, postfix = "}", prefix = "{")

    list2.last()
    list2.max()

    try {

        val line = reader.readLine()

        return Integer.parseInt(line)
    }catch (e: NumberFormatException){
        return null
    }finally {
        reader.close()
    }

}


fun  String.lastChar(): Char{
    return this.get(this.length -1)
}



fun <T> joinToString(collection: Collection<T>, separator: String, prefix: String, postfix: String): String{


    val result = StringBuffer(prefix)
    for((index, element) in collection.withIndex()){
        if(index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}




















