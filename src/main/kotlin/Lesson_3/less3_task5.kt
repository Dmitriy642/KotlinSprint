package org.example.Lesson_3

fun main() {
    val dataString = "D2-D4;0"
    val split = dataString.split("-", ";")
    val startOfMove = split.elementAt(0)
    val endOfMove = split.elementAt(1)
    val numberOfMove = split.elementAt(2)

    println(startOfMove)
    println(endOfMove)
    println(numberOfMove)
}