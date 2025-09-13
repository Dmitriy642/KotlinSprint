package org.example.Lesson_2

fun main() {
    val percentageOfBenefit = 20
    val percentageСalculation = (percentageOfBenefit.toFloat()/100)
    val minedDiamonds = 7
    val minedIron = 11
    val buffDiamond = minedDiamonds * percentageСalculation
    val buffIron = minedIron * percentageСalculation

    println("Bonus diamonds: ${buffDiamond.toInt()}")
    println("Bonus iron: ${buffIron.toInt()}")
}



