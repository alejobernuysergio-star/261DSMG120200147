/*
fun main() {
    val discountPercentage: Int = 0
    val offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    println(offer)
}
¿Puedes determinar la causa raíz de esos errores y corregirlos?
¿Puedes determinar el resultado de este programa antes de ejecutar el código en Kotlin Playground?
 */
// Regla: Parametros tipo var pueden cambiar durante el cuerpo de 1 funcion
//        Parametros tipo val no pueden cambiar durante el cuerpo de 1 funcion
fun main() {
    var discountPercentage: Int = 0
    var offer: String = ""

    val item = "Google Chromecast"
    discountPercentage = 20

    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}