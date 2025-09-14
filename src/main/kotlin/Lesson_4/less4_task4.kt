package org.example.Lesson_4

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    val numberOfDay = 5
    val armsAndAbs = (numberOfDay % 2) != 0
    val legsAndBack = (numberOfDay % 2) == 0
    println(
        "Упражнения для рук:$armsAndAbs\n" +
                "Упражнения для ног:$legsAndBack\n" +
                "Упражнения для спины:$legsAndBack\n" +
                "Упражнения для пресса:$armsAndAbs"
    )
}