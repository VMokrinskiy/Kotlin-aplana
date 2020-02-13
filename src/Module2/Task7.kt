package Module2

fun main (Args: Array<String>){
    var numOfRightAnswers: Int = 0
    println("В каком году началась вторая мировая война?")
    var firstAnswer: String? = readLine()
    if (firstAnswer.toString() == "1939" ){
        numOfRightAnswers +=1
    }
    println("В каком году Гагарин полетел в космос?")

    var secondAnswer: String? = readLine()
    if (secondAnswer.toString() == "1961" ){
        numOfRightAnswers +=1
    }

    println("В каком году произошло Бородинское сражение?")

    var thirdAnswer: String? = readLine()
    if (thirdAnswer.toString() == "1812" ){
        numOfRightAnswers +=1
    }

    println("В каком году был проведен первый чемпионат мира по футболу?")

    var fourthAnswer: String? = readLine()
    if (fourthAnswer.toString() == "1930" ){
        numOfRightAnswers +=1
    }

    println("В каком году отменили крепостное право?")

    var fifthAnswer: String? = readLine()
    if (fifthAnswer.toString() == "1861" ){
        numOfRightAnswers +=1
    }

    when (numOfRightAnswers){
        5 -> println("Вы знаток истории")
        4 -> println("Ваши знания истории на крепкую четверку")
        3 -> println("Уровень ваших знаний - средний")
        else -> println("Вам бы не помешало подтянуть историю")
    }
}