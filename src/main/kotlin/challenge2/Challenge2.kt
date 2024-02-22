package challenge2

fun main() {

    val float1: Float? = -3847.384f
    val float2: Float? = -3847.384f.toFloat()

    val shortArray = shortArrayOf(1,2,4,5)

    val arrayNullable = Array<Int?>(40) {i -> (i + 1) * 5 }

    val charArray = charArrayOf('a', 'b', 'c')

    val x: String? = "I AM IN UPPERCASE"
    val z = x?.lowercase() ?: "I give up!"
    println(z)

    x?.let { print( it.lowercase().replace("am", "am not"))}

    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()
}