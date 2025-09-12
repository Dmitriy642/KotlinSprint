package org.example.Lesson1_1

const val MINUTES_IN_HOUR = 60
fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeInMinute = 457

    val departureTimeInMinutes = departureHour * MINUTES_IN_HOUR + departureMinute
    val totalTime = departureTimeInMinutes + travelTimeInMinute
    val hour = totalTime / MINUTES_IN_HOUR
    val minute = totalTime - (hour * MINUTES_IN_HOUR)
    val travelTime = String.format("%02d:%02d", hour, minute)

    println(travelTime)
}

/*
Сайт с расписанием поездов получает данные с сервера.
Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них.
Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

– Создай целочисленные переменные и проинициализируй их этими данными;
– Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
– Выведи результат в консоль.*/
