package org.example.Lesson_3

fun main() {
    val inputNumber = 7
    println("$inputNumber x 1 = ${inputNumber * 1} \n" +
            "$inputNumber x 2 = ${inputNumber * 2} \n" +
            "$inputNumber x 3 = ${inputNumber * 3} \n" +
            "$inputNumber x 4 = ${inputNumber * 4} \n" +
            "$inputNumber x 5 = ${inputNumber * 5} \n" +
            "$inputNumber x 6 = ${inputNumber * 6} \n" +
            "$inputNumber x 7 = ${inputNumber * 7} \n" +
            "$inputNumber x 8 = ${inputNumber * 8} \n" +
            "$inputNumber x 9 = ${inputNumber * 9} \n"
    )
}

/*
Пишем программу, которая будет помогать учить таблицу умножения.
В отдельную переменную будет записываться число (объявить и проинициализировать),
а выводиться будет таблица умножения для этого числа.
Таблица должна корректно печататься, если в исходную переменную подставлять разные числа.

Пример вывода:
6 x 1 = 6
6 x 2 = 12
…
6 x 9 = 54

– Вместо числа 6 использовать данные из объявленной переменной;
– Вычислять значения прямо в строке;
– Вывод всей таблицы нужно сделать в одной функции println(), которая вызывается один раз.*/
