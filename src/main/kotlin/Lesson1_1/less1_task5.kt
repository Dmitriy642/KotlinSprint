package org.example.Lesson1_1

const val TOTAL_NUMBER_OF_SECOND = 6480
const val SECONDS_IN_ONE_HOUR = 3600
const val SECONDS_IN_ONE_MINUTE = 60

fun main() {
    val hour = TOTAL_NUMBER_OF_SECOND / SECONDS_IN_ONE_HOUR
    val minute = (TOTAL_NUMBER_OF_SECOND - (hour * SECONDS_IN_ONE_HOUR)) / SECONDS_IN_ONE_MINUTE
    val remainingSeconds = TOTAL_NUMBER_OF_SECOND - (minute * SECONDS_IN_ONE_MINUTE + hour * SECONDS_IN_ONE_HOUR)

    val time = String.format("%02d:%02d:%02d", hour, minute, remainingSeconds)

    println(time)

}