package org.example.Lesson_3

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    var startOfMove = "E2"
    var endOfMove = "E4"
    var numberOfMove = 1

    println("$startOfMove-$endOfMove;$numberOfMove")

    startOfMove = "D2"
    endOfMove = "D3"
    numberOfMove++

    println("$startOfMove-$endOfMove;$numberOfMove")
}