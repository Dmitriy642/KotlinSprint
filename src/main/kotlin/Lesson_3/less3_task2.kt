package org.example.Lesson_3

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    var lastName = "Андреева"
    val name = "Татьяна"
    var otchestvo = "Сергеевна"
    var age = 20

    println("Данные до брака:\n ФИО: $lastName $name $otchestvo\n возраст: $age")

    lastName = "Сидорова"
    age = 22

    println("Данные на момент брака:\n ФИО: $lastName $name $otchestvo\n возраст: $age")
}