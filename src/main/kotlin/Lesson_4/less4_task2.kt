package org.example.Lesson_4

fun main() {
    System.setOut(java.io.PrintStream(System.out, true, "UTF-8"))
    var weight = 20
    var volume = 80
    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': " +
                "${
                    (weight > MINIMUM_PERMISSIBLE_WEIGHT) &&
                            (weight <= MAXIMUM_PERMISSIBLE_WEIGHT) && (volume < MAXIMUM_PERMISSIBLE_VOLUME)
                }"
    )

    weight = 50
    volume = 100

    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': " +
                "${
                    (weight > MINIMUM_PERMISSIBLE_WEIGHT) &&
                            (weight <= MAXIMUM_PERMISSIBLE_WEIGHT) && (volume < MAXIMUM_PERMISSIBLE_VOLUME)
                }"
    )
}

const val MINIMUM_PERMISSIBLE_WEIGHT = 35
const val MAXIMUM_PERMISSIBLE_WEIGHT = 100
const val MAXIMUM_PERMISSIBLE_VOLUME = 100