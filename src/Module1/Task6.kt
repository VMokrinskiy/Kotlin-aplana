package Module1

fun main(Args: Array<String>){
    println("Please, enter two numbers:")
    var a: String? = readLine()
var b: String? = readLine()
var result: Boolean =  (a.toString()).toInt() > (b.toString()).toInt()
println("result = " + result)
}
