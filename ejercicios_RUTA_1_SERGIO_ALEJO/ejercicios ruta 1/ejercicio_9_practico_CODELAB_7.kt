/*
En este ejercicio, implementarás una función que compara la cantidad de minutos que usaste el teléfono hoy y ayer.
La función acepta dos parámetros de números enteros y muestra un valor booleano.

El primer parámetro contiene la cantidad de minutos de uso de hoy, y el segundo, la cantidad de minutos de uso de ayer.
La función muestra un valor true si pasaste más tiempo en el teléfono hoy que ayer. De lo contrario, muestra un valor false.
 */
fun main() {
    //Llamado a las funciones para comparar los tiempos
    println(compararTiempoUso(300, 250)) // Debería mostrar true
    println(compararTiempoUso(300, 300)) // Debería mostrar false
    println(compararTiempoUso(200, 220)) // Debería mostrar false
}

fun compararTiempoUso(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {//RETORNO TRUE O FALSE
    // Compara si el tiempo de hoy es mayor al de ayer
    return timeSpentToday > timeSpentYesterday //SE USA UN OPERADOR > O < para TRUE O FALSE
}