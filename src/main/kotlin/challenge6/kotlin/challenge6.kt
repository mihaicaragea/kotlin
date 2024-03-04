package challenge6.kotlin

import challenge6.javacode.Employee

fun main() {
    val employee = Employee("Jane", "Smith", 2000)

    employee.lastName = "Jones"
    employee.salaryLast3Years = floatArrayOf(50000.34f, 54000.70f, 43.33333f)

}