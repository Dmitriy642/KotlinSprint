package org.example.Lesson1_1

const val PERMANENT_EMPLOYEE = 50
const val SALARY_PE = 30000
const val INTERNS = 30
const val SALARY_INTERNS = 20000
const val TOTAL_NUMBER_OF_EMPLOYEES = 80

fun main() {
    val paymentsPermanentEmployee = PERMANENT_EMPLOYEE * SALARY_PE
    val totalExpenses = paymentsPermanentEmployee + (INTERNS * SALARY_INTERNS)
    val averageSalaryPerEmployee = totalExpenses / TOTAL_NUMBER_OF_EMPLOYEES

    println(paymentsPermanentEmployee)
    println(totalExpenses)
    println(averageSalaryPerEmployee)
}

