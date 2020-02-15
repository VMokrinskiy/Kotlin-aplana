package Module4

fun main(Args: Array<String>){
    var flight: AirCraft = AirCraft()
    println(flight.fuelConsamption)
}

class AirCraft() {
    var numberOfPlane: Int = 1
    var maxFlightDistance: Double = 1000.0
    var maxCapacityOfFuel: Double = 15.9
    var fuelConsamption: Double = 2.3
        get() = (maxCapacityOfFuel * 100 / maxFlightDistance)
}