package org.example.Lesson_3

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    var startOfMove = 2
    var endOfMove = 4
    var numberOfMove = 4

    println("Ход чёрных: [E$startOfMove -> E$endOfMove; $numberOfMove]")

    startOfMove = 2
    numberOfMove = 5
    endOfMove = startOfMove + 1

    println("Ход белых: [D$startOfMove -> D$endOfMove; $numberOfMove]")
}
