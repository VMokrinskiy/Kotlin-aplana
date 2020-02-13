package Module2

fun main(Args: Array<String>){
    println("Введите сумму вклада")
    var inputRes: String? = readLine()
    if (inputRes.toString()!=""){
        var sumOfInput = (inputRes.toString()).toDouble()
        println("Введите процент вклада")
        inputRes = readLine()
        if (inputRes.toString()!=""){
            var percent = (inputRes.toString()).toInt()
            println("Введите продолжительность вклада")
            inputRes = readLine()
            if (inputRes.toString()!=""){
                var length = (inputRes.toString()).toInt()
                var income : Double = 0.0
                if (length !=0){
                    for (i in 1..length){
                        income = sumOfInput*percent/100
                        sumOfInput += income
                        println("Номер месяца - "+i)
                        println("Доход в этом месяце - "+income)
                        println("Состояние счета - "+ sumOfInput)
                        println()
                    }
                }
                else println("Не верно указана продолжительность вклада")
            }
            else println("Не введен срок вклада")
        }
        else println("Не введен процент вклада")
    }
    else println("Не введена сумма вклада")

}