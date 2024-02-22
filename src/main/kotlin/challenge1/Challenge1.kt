package challenge1

fun main() {

    val hello1 = "Hello"
    val hello2 = "Hello"

    println("hello1 is referentially equal to hello2: ${hello2===hello1}")
    println("hello1 is structurally equal to hello2: ${hello2==hello1}")

    var num = 2988

    val text: Any = "The any string"

    if (text is String) {
        println(text.uppercase())
    }

    println( """   1
        |  11
        | 111
        |1111""".trimMargin("|"))

    println( """   1
        1  11
        1 111
        11111""".trimMargin("1"))
}