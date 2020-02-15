package Module4

fun main(Args: Array<String>){
    var flight: AirCraft = AirCraft(2, 132.3, 10.2)
    println(flight.fuelConsamption)
}

class AirCraft(numberOfPlane:Int, maxFlightDistance:Double, maxCapacityOfFuel:Double) {
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