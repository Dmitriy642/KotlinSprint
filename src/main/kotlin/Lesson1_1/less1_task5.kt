package org.example.Lesson1_1

fun main(){
   val seconds: Short = 6480
   val hour =  seconds/3600
   val minute = (seconds-(hour*3600))/60
   val remainingSeconds = seconds - (minute*60+hour*3600)

        val time = String.format("%02d:%02d:%02d",hour, minute, remainingSeconds)

    println(time)

}