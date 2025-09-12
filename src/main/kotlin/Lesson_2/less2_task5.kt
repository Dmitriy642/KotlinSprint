package org.example.Lesson_2

import kotlin.math.pow


fun main() {
    val startSum = 70000
    val percent = 16.7
    val periodYears = 20
    val formula = startSum * (1 + percent.toDouble() / 100).pow(periodYears)
    val result = String.format("%.3f", formula)

    println(result)
}


