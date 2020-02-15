package Module3

import kotlin.math.sqrt

fun main(Args: Array<String>){
    println("Введите число")
    var number: String? = readLine()
    fun Double.sqrtFun(){
        println(sqrt(this))
    }
    (number.toString()).toDouble().sqrtFun()
}