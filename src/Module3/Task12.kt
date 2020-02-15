package Module3

fun main(Args: Array<String>){
    println("Введите год")
    var year: String? = readLine()
    isLeapYear(year.toString())
}

fun isLeapYear(year:String){
    if (year.toInt()%4 == 0){
        println("Год "+ year + " високосный")
    }
    else println("Год "+ year + " невисокосный")
}