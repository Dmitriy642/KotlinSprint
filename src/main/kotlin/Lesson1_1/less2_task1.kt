package org.example.Lesson1_1

class Person(val name: String, val mark: Double){
}
fun main(){
    val students = mutableListOf(Person("Kirill",4.0), Person("Vadim",3.0),
        Person("Grigory", 5.0), Person("Alexandr", 3.0))
    val averageValue: Double = (students.sumOf { it.mark })/students.count()
    println(averageValue)
}
