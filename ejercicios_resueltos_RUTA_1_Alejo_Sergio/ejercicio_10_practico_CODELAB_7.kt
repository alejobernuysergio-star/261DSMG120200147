/*
En este programa, se muestra el clima de diferentes ciudades.
Incluye el nombre de la ciudad, las temperaturas máxima y mínima del día, y las probabilidades de lluvia.

¿Puedes crear una función que imprima los detalles del clima
de una sola ciudad para reducir la repetición en la función main() y, luego, hacer lo mismo en las ciudades restantes?

¿Puedes actualizar la función main() para llamar a la función que creaste para cada ciudad y
pasar los detalles apropiados del clima como argumentos?
 */
fun main() {
    //Llamado a la funcion para mostrar las caracteristicas de clima de cada ciudad
    mostrarClima("Ankara", 27, 31, 82)//4 argumentos ya asignados con 1 valor
    mostrarClima("Tokyo", 32, 36, 10)
    mostrarClima("Cape Town", 59, 64, 2)
    mostrarClima("Guatemala City", 50, 55, 7)
}
//Uso de expresion de plantilla ($) para llamar a parametros en los println
fun mostrarClima(ciudad: String, minima: Int, maxima: Int, lluvia: Int) {
    println("City: $ciudad")
    println("Low temperature: $minima, High temperature: $maxima")
    println("Chance of rain: $lluvia%")
    println() // Espacio en blanco entre ciudades

    //No se hace uso de return ya que la funcion puede no tener retorno
}