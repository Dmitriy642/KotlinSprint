package org.example.Lesson_4

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    val tablesAreBookedForToday = TOTAL_NUMBER_OF_TABLES
    val tablesAreBookedForTomorrow = 9
    val freeTablesForToday = tablesAreBookedForToday < TOTAL_NUMBER_OF_TABLES
    val freeTablesForTomorrow = tablesAreBookedForTomorrow < TOTAL_NUMBER_OF_TABLES

    println("Доступность столиков на сегодня: $freeTablesForToday")
    println("Доступность столиков на завтра: $freeTablesForTomorrow")
}

const val TOTAL_NUMBER_OF_TABLES = 13