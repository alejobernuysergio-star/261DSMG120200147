fun main() {
    //1 TIPO LLAMADO: No dandole un valor al parametro predeterminado
    val firstUserEmailId = "user_one@gmail.com"

    //Si vas a cambiar el orden de los argumentos se debe asignar un nombre a los argumentos
    //De esta manera la funcion se guia para asignar valores a sus parametros
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    //2 y 3 tipo de llamdo: Se le puede asignar un valor a ese parametro predeterminado
    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}
//Funcion con parametro predeterminado y uno sin valor asignado
fun displayAlertMessage(
    operatingSystem: String = "Unknown OS",
    emailId: String
): String {
    return "There is a new sign-in request on $operatingSystem for your Google Account $emailId."
}