//Para el nombre de funciones y parametros
//Hay que 2 seguir 2 estandares:
//Mayusculas mediales y 1ra palabra en minusculas
fun main() {
    val Steps = 4000 //steps
    val caloriesBurned = PEDOMETERstepsTOcalories(Steps);
    //CORRECION: val caloriesBurned = pedometerStepsToCalories(Steps);

    println("Walking $Steps steps burns $caloriesBurned calories")
    //println("Walking $steps steps burns $caloriesBurned calories")

}

fun PEDOMETERstepsTOcalories(NumberOFStepS: Int): Double {//CORRECION: fun pedometerStepsToCalories(NumberOFStepS: Int): Double
    val CaloriesBURNEDforEachStep = 0.04//CORRECION: val caloriesBurnedForEachStep = 0.04

    val TotalCALORIESburned = NumberOFStepS * CaloriesBURNEDforEachStep
    //CORRECION: val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep

    return TotalCALORIESburned //CORRECCION: totalCaloriesBurned
}