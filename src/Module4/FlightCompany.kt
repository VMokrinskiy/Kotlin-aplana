package Module4

fun main(Args: Array<String>){
    var boeing747: Boeing747 = Boeing747(1,2,12.0,23.2)
    println(boeing747.numOfPassengers)
    boeing747.printInfo()
}

open interface Passenger{
    val numOfPassengers:Int
}

abstract class AirCraft(numberOfPlane:Int, maxFlightDistance:Double, maxCapacityOfFuel:Double) {
    protected var numberOfPlane: Int = 1
    protected var maxFlightDistance: Double = 1000.0
    protected var maxCapacityOfFuel: Double = 15.9
    init{
        this.numberOfPlane = numberOfPlane
        this.maxFlightDistance = maxFlightDistance
        this.maxCapacityOfFuel = maxCapacityOfFuel
    }
    protected var fuelConsamption: Double = 2.3
        get() = (maxCapacityOfFuel * 100 / maxFlightDistance)
    open fun printInfo(){
        println("Номер самолета - " + numberOfPlane)
        println("Максимальная дистанция полета - " + maxFlightDistance)
        println("Вместимость топлива - "+ maxCapacityOfFuel)
        println("Расход топлива на 100км - "+fuelConsamption)
    }

}

class Boeing747(numOfPassengers:Int, numberOfPlane:Int, maxFlightDistance:Double, maxCapacityOfFuel:Double) : AirCraft(numberOfPlane, maxFlightDistance, maxCapacityOfFuel), Passenger{
    override var numOfPassengers: Int = 0
    init{
        this.numOfPassengers = numOfPassengers
    }
    override fun printInfo() {
        println("Количество пассажиров - "+numOfPassengers)
        println("Номер самолета - " + numberOfPlane)
        println("Максимальная дистанция полета" + maxFlightDistance)
        println("Вместимость топлива - "+ maxCapacityOfFuel)
        println("Расход топлива на 100км"+fuelConsamption)
    }
}