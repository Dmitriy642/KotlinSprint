package org.example.Lesson1_1


fun main() {
    val PERMANENT_EMPLOYEE = 50
    val SALARY_PE = 30000
    val INTERNS = 30
    val SALARY_INTERNS = 20000

    val TOTAL_NUMBER_OF_EMPLOYEES = 80

    val paymentsPermanentEmployee = PERMANENT_EMPLOYEE * SALARY_PE
    val totalExpenses = paymentsPermanentEmployee + (INTERNS * SALARY_INTERNS)
    val averageSalaryPerEmployee = totalExpenses / TOTAL_NUMBER_OF_EMPLOYEES

    println(paymentsPermanentEmployee)
    println(totalExpenses)
    println(averageSalaryPerEmployee)
}

