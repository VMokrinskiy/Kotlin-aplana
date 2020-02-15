package Module4

fun main(Args: Array<String>){
    var flight: AirCraft = AirCraft(2, 132.3, 10.2)
    var boeing747: Boeing747 = Boeing747(1,2,12.0,23.2)
    println(boeing747.numOfPassengers)
}

open interface Passenger{
    val numOfPassengers:Int
}

open class AirCraft(numberOfPlane:Int, maxFlightDistance:Double, maxCapacityOfFuel:Double) {
    var numberOfPlane: Int = 1
    var maxFlightDistance: Double = 1000.0
    var maxCapacityOfFuel: Double = 15.9
    init{
        this.numberOfPlane = numberOfPlane
        this.maxFlightDistance = maxFlightDistance
        this.maxCapacityOfFuel = maxCapacityOfFuel
    }
    var fuelConsamption: Double = 2.3
        get() = (maxCapacityOfFuel * 100 / maxFlightDistance)
}

class Boeing747(numOfPassengers:Int, numberOfPlane:Int, maxFlightDistance:Double, maxCapacityOfFuel:Double) : Passenger{
    override val numOfPassengers:Int
    init{
        this.numOfPassengers = numOfPassengers
    }
}