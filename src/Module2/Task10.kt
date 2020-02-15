package Module2

fun main(Args: Array<String>){
    var numOfAction: String? = "0"
    var ArrayList: ArrayList<String> = arrayListOf("Moscow", "London")

    while (numOfAction!="4"){
        println("Выберите действие:")
        println("Нажмите '1' чтобы добавить название города")
        println("Нажмите '2' чтобы просмотреть список городов")
        println("Нажмите '3' чтобы посмотреть список уникальных городов")
        println("Нажмите '4' для выхода")
        numOfAction = readLine()
        when (numOfAction){
            "1"->{
                println("Введите название города")
                var nameOfNewCity: String? = readLine()
                ArrayList.add(nameOfNewCity.toString())
                println("Город сохранен")
            }
            "2"->{
                println("Список городов:")
                for (n in ArrayList){
                    println(n)
                }
                println()
            }
            "3"->{
                println("Список уникальных городов:")
                var uniqArrList : ArrayList<String> = arrayListOf()
                for (n in ArrayList){
                    if ( !uniqArrList.contains(n)){
                        uniqArrList.add(n)
                        println(n)
                    }
                }
                println()
            }
            "4"-> println("Выход из программы")
            else -> println("Введено некорректное значение")
        }

    }

}