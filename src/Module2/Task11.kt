package Module2

fun main(Args: Array<String>){
    var map: Map<String, String> = mapOf("1" to "Ivanov", "2" to "Petrov", "3" to "Dmitriev")
    println("Введите номер сотрудника:")
    var num: String? = readLine()
    if (map.containsKey(num.toString())){
        println("Рабочее место №" + num.toString() + " занимает сотрудник "+map.get(num.toString()))
    }
    else println("Нет информации по номеру рабочего места "+num.toString())

}