package challenge5

fun main() {
    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val jean = Person("Jean", "Smithson", 66)
    val john = Person("John", "Adams", 32)

    val people = mapOf("Jones" to joe,
        "Smith" to jane,
        "Wilson" to mary,
        "Smithson" to jean,
        "Adams" to john)

    println(people.filter { it.value.lastName.startsWith("S") }.count())

    val namePairs = people.map { Pair(it.value.firstName, it.value.lastName) }
    println(namePairs)

    people.also {
        it.map { println("${it.value.firstName} is ${it.value.age} years old") }
    }

    val (fName, lName, age) = joe
    println("fName = $fName, lName = $lName, age= $age")

    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf(4, 55, -83, 22, 101, 15)

    val list3 = list1.filter { it in list2 }
    println(list3)


    val regularPaper = Box<Regular>()
    var paper  = Box<Paper>()
    paper = regularPaper
}




class Person(val firstName: String, val lastName: String, val age: Int) {

    operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = age

}

class Box<out  T> {

}

open class Paper {

}

class Regular: Paper() {

}