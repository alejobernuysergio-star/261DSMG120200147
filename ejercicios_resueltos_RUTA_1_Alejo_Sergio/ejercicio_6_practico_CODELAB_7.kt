fun main() {
    //argumentos para las funciones ADD y SUBSTRACT
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

   //GUARDADO DE RETORNOS INT DE LAS FUNCIONES  EN 2 PARAMETROS
    val result = add(firstNumber, secondNumber)
    val anotherResult = subtract(firstNumber, thirdNumber)

    //LLAMADO DE LOS 2 PARAMETROS CON LITERALES QUE SON LOS RETORNOS
    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}
//1
fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}