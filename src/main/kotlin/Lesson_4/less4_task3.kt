package org.example.Lesson_4

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    val weatherToday = SUNNY_WEATHER
    val theAwningIsCurrently = THE_AWNING_IS_OPEN
    val airHumidity = 20
    val timeOfYear = "Весна"
    val favorableConditions = (weatherToday == SUNNY_WEATHER) and (theAwningIsCurrently == THE_AWNING_IS_OPEN) and
            (airHumidity == PERMISSIBLE_AIR_HUMIDITY) and (timeOfYear != WINTER)

    println(favorableConditions)

}

const val SUNNY_WEATHER = true
const val THE_AWNING_IS_OPEN = true
const val PERMISSIBLE_AIR_HUMIDITY = 20
const val WINTER = "Зима"