//concatenar ints con " ", no van a sumarse en un nuevo parametro
//se guardan como string por las comillas
//se muestran como string al llamado println
fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
