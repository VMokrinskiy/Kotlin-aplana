package Module2

fun main(Args: Array<String>){
    var table: Array<Array<String>> = Array(3, {Array(3,{"0"})})
    table[0] = arrayOf("Russia", "USA", "France")
    table[1] = arrayOf("Moscow", "Washington", "Paris")
    table[2] = arrayOf("RUB", "$", "Euro")

    for (i in 0..2){
        for (j in 0..2){
            print(table[j][i] + " ")
        }
        println()
    }
}

