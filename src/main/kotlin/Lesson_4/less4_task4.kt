package org.example.Lesson_4

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    val numberOfDay = 2
    val isEven = (numberOfDay % 2) == 0
    println(
        "Упражнения для рук:${!isEven}\n" +
                "Упражнения для ног:$isEven\n" +
                "Упражнения для спины:$isEven\n" +
                "Упражнения для пресса:${!isEven}"
    )
}