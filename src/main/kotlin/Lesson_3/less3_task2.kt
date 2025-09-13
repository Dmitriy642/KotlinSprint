package org.example.Lesson_3

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    val lastNameAt20 = "Андреева"
    val name = "Татьяна"
    val otchestvo = "Сергеевна"
    val ageBeforeMarriage = 20
    val ageAfterMarriage = 22
    val lastNameAt22 = "Сидорова"

    println("Данные до брака:\n ФИО: $lastNameAt20 $name $otchestvo\n возраст: $ageBeforeMarriage")
    println("Данные на момент брака:\n ФИО: $lastNameAt22 $name $otchestvo\n возраст: $ageAfterMarriage")
}



