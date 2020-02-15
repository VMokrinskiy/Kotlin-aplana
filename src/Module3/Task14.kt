package Module3

fun main(Args: Array<String>){
    var name: String = "Ivanov"
    var age: Int = 25
    var status: String = "married"
    var job: String = "Engineer"
    printInfo(name, age, job)
}

fun printInfo(name:String, job:String) = println("ФИО - " +name +  ", должность - "+ job)

fun printInfo(name: String, age:Int, job:String) = println("ФИО - " +name +", возраст - "+ age+  ", должность - "+ job)

fun printInfo(name:String, status:String, job: String) {
    println("ФИО - " +name +", семейное положение - "+ status+  ", должность - "+ job)
}

fun printInfo(name:String, age:Int, status:String, job: String) {
    println("ФИО - " +name +", возраст - "+ age+  ", семейное положение - "+ status+  ", должность - "+ job)
}
