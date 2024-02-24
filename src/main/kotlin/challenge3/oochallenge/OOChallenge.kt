package challenge3.oochallenge

fun main() {

//    val bicycle = KotlinBicycle(10, 3, 10)
//    bicycle.printDescription()
//
//    val mountainBike = KotlinMountainBike(29 , 34, 32, 3)
//    mountainBike.printDescription()
//
//    val roadBike = KotlinRoadBike(23, 43, 43,2)
//    roadBike.printDescription()
//
//    val bicycle = KotlinBicycle(10, 3)
//    bicycle.printDescription()
//
//    val mountainBike = KotlinMountainBike(29 , 34, 32)
//    mountainBike.printDescription()
//
//    val roadBike = KotlinRoadBike(23, 43, 43)
//    roadBike.printDescription()

    val mountainBike3 = KotlinMountainBike("Blue",10, 10, 10)
    mountainBike3.printDescription()
    KotlinMountainBike.availableColors.forEach { println(it) }
}

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println("Bike is in gear $gear with a cadence of $cadence " +
                "travelling at speed of $speed .")
    }
}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10) :
    KotlinBicycle(cadence, speed, gear) {

    constructor(color: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10) :
            this(seatHeight, cadence, speed, gear) {
        println("This is the $color")
    }

    companion object {
        val availableColors = listOf("blue", "red", "white", "black", "green", "brown")
    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches")
    }
}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int = 10): KotlinBicycle(cadence, speed, gear) {
    override fun printDescription() {
        super.printDescription()
        println("The road bike has tire width $tireWidth MM.")
    }
}