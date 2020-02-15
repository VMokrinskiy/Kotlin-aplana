package Module3

fun main(Args: Array<String>){
    val printer = {a:Array<Int>->
        for (n in a){
            println(n)
        }
    }
    var arr: Array<Int> = arrayOf(1,2,3)
    printer(arr)
}