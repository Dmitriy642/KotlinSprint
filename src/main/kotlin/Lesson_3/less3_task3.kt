package org.example.Lesson_3

fun main() {
    val inputNumber = 7
    val multiStr = """
        $inputNumber x 1 = ${inputNumber * 1}
        $inputNumber x 2 = ${inputNumber * 2}
        $inputNumber x 3 = ${inputNumber * 3}
        $inputNumber x 4 = ${inputNumber * 4}
        $inputNumber x 5 = ${inputNumber * 5}
        $inputNumber x 6 = ${inputNumber * 6}
        $inputNumber x 7 = ${inputNumber * 7}
        $inputNumber x 8 = ${inputNumber * 8}
        $inputNumber x 9 = ${inputNumber * 9}
    """.trimIndent()

    println(multiStr)
}