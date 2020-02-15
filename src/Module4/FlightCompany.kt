package Module4

fun main(Args: Array<String>){
    val boeing747: Boeing747 = Boeing747("Boeing647",1,2,12.0,23.2)
    val tU134: TU134 = TU134("TU134",8, 5, 1008.2, 12.4)
    val cargoPlane: CargoPlane = CargoPlane("CargoPlane1",15.9, 7, 2333.2, 122.1)
    val cargoPlane2: CargoPlane = CargoPlane("CargoPlane2",12.4, 3, 222.1, 11.1)
    val arrayList: ArrayList<AirCraft> = arrayListOf(boeing747, tU134, cargoPlane,cargoPlane2)
    var numOfCommand = 0
    while (numOfCommand!=7){
        println("Выберите действие:")
        println("1. Вывести информацию по всем самолетам")
        println("2. Вывести информацию по всем  грузовым самолетам")
        println("3. Вывести информацию по всем пассажирским самолетам")
        println("4. Вывести список всех самолетов, у которых максимальная дальность полета выше указанной величины")
        println("5. Вывести список всех самолетов, у которых расход топлива меньше указанной величины")
        println("6. Вывести список всех самолетов, у которых вместимость топливного бака больше указанной величины")
        println("7. Выход")
        numOfCommand = (readLine().toString()).toInt()
        when (numOfCommand){
            1 -> {
                for (n in arrayList){
                    n.printInfo()
                }
            }
            2-> {
                for (n in arrayList){
                    if (n is Cargo){
                        n.printInfo()
                    }
                }
            }
            3-> {
                for (n in arrayList){
                    if (n is Passenger){
                        n.printInfo()
                    }
                }
            }
            4->{
                println("Введите значение дальности полета:")
                val maxflight: Double = (readLine().toString()).toDouble()
                for (n in arrayList){
                    val flightinfo: Double = n.maxFlightDistance
                    if (flightinfo>maxflight){
                        n.printInfo()
                    }
                }
            }
            5->{
                println("Введите значение расхода топлива:")
                val maxfuel: Double = (readLine().toString()).toDouble()
                for (n in arrayList){
                    val fuelInfo: Double = n.fuelConsamption
                    if (maxfuel>fuelInfo){
                        n.printInfo()
                    }
                }
            }
            6->{
                println("Введите значение величины топливного бака:")
                val maxCapacity: Double = (readLine().toString()).toDouble()
                for (n in arrayList){
                    val capacitytinfo: Double = n.maxCapacityOfFuel
                    if (capacitytinfo>maxCapacity){
                        n.printInfo()
                    }
                }
            }
            7 -> println("Выход из программы")
            else -> println("Введена не существующая команда")
        }
    }
}

open interface Passenger{
    val numOfPassengers:Int
}

open interface Cargo{
    val maxWeightOfCargo: Double
}

abstract class AirCraft(numberOfPlane:Int, maxFlightDistance:Double, maxCapacityOfFuel:Double) {
    internal var numberOfPlane: Int = 1
    internal var maxFlightDistance: Double = 1000.0
    internal var maxCapacityOfFuel: Double = 15.9
    init{
        this.numberOfPlane = numberOfPlane
        this.maxFlightDistance = maxFlightDistance
        this.maxCapacityOfFuel = maxCapacityOfFuel
    }
    internal var fuelConsamption: Double = 2.3
        get() = (maxCapacityOfFuel * 100 / maxFlightDistance)
    open fun printInfo(){
        println("Номер самолета - " + numberOfPlane)
        println("Максимальная дистанция полета - " + maxFlightDistance)
        println("Вместимость топлива - "+ maxCapacityOfFuel)
        println("Расход топлива на 100км - "+fuelConsamption)
    }

}

class Boeing747(PlaneName: String, numOfPassengers:Int, numberOfPlane:Int, maxFlightDistance:Double, maxCapacityOfFuel:Double) : AirCraft(numberOfPlane, maxFlightDistance, maxCapacityOfFuel), Passenger{
    override var numOfPassengers: Int = 0
    var PlaneName: String
    init{
        this.numOfPassengers = numOfPassengers
        this.PlaneName = PlaneName
    }
    override fun printInfo() {
        println("Имя самолета - "+PlaneName)
        println("Количество пассажиров - "+numOfPassengers)
        println("Номер самолета - " + numberOfPlane)
        println("Максимальная дистанция полета - " + maxFlightDistance)
        println("Вместимость топлива - "+ maxCapacityOfFuel)
        println("Расход топлива на 100км - "+fuelConsamption)
        println()
    }
}

class CargoPlane(PlaneName: String, maxWeightOfCargo:Double, numberOfPlane:Int, maxFlightDistance:Double, maxCapacityOfFuel:Double) : AirCraft(numberOfPlane, maxFlightDistance, maxCapacityOfFuel), Cargo{
    override val maxWeightOfCargo: Double
    var PlaneName:String
    init{
        this.PlaneName = PlaneName
        this.maxWeightOfCargo = maxWeightOfCargo
    }
    override fun printInfo() {
        println("Имя самолета - "+PlaneName)
        println("Максимальная грузоподьемность - "+maxWeightOfCargo)
        println("Номер самолета - " + numberOfPlane)
        println("Максимальная дистанция полета - " + maxFlightDistance)
        println("Вместимость топлива - "+ maxCapacityOfFuel)
        println("Расход топлива на 100км - "+fuelConsamption)
        println()
    }
}

class TU134(PlaneName: String,numOfPassengers:Int, numberOfPlane:Int, maxFlightDistance:Double, maxCapacityOfFuel:Double) : AirCraft(numberOfPlane, maxFlightDistance, maxCapacityOfFuel), Passenger{
    override var numOfPassengers: Int = 0
    var PlaneName:String
    init{
        this.PlaneName = PlaneName
        this.numOfPassengers = numOfPassengers
    }
    override fun printInfo() {
        println("Имя самолета - "+PlaneName)
        println("Количество пассажиров - "+numOfPassengers)
        println("Номер самолета - " + numberOfPlane)
        println("Максимальная дистанция полета - " + maxFlightDistance)
        println("Вместимость топлива - "+ maxCapacityOfFuel)
        println("Расход топлива на 100км - "+fuelConsamption)
        println()
    }
}