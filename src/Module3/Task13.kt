package Module3

fun main(Args: Array<String>){
    var arrayOfNames: Array<String> = arrayOf("Petrov","Dmitriev","Sokolov")
    countOfEmployees(*arrayOfNames)
}

fun countOfEmployees(vararg Names:String){
    println("Количество сотрудников - "+Names.size)
}