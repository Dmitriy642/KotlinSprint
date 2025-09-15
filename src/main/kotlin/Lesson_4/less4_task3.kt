package org.example.Lesson_4

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    val isSunnyToday = true
    val isTheAwningOpen = true
    val airHumidity = 20
    val timeOfYear = "Зима"
    val favorableConditions = (isSunnyToday == IS_SUNNY_WEATHER) && (isTheAwningOpen == IS_AWNING_OPEN) &&
            (airHumidity == PERMISSIBLE_AIR_HUMIDITY) && (timeOfYear != UNFAVORABLE_TIME_OF_YEAR)

    println(favorableConditions)

}

const val IS_SUNNY_WEATHER = true
const val IS_AWNING_OPEN = true
const val PERMISSIBLE_AIR_HUMIDITY = 20
const val UNFAVORABLE_TIME_OF_YEAR = "Зима"