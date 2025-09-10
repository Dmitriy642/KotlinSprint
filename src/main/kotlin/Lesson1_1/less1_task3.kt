package org.example.Lesson1_1

fun main(){
  val year = 1961
  var hour = 9
    val hourLast = String.format("%02d",hour)
  var minute = 7
    val minuteLast = String.format("%02d", minute)

    println("takeoff year:$year")
    println(hourLast)
    println(minuteLast)

    hour = 7
    minute = 5
        val landingTime = String.format("%02d:%02d", hour, minute)

    print(landingTime)
}