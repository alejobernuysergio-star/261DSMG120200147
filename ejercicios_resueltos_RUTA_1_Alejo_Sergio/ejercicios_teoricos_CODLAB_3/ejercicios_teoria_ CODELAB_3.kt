// RUTA DE APRENDIZAJE "Introducción a la programación en Kotlin"

// CODLAB #3 "TU PRIMER PROGRAMA EN KOTLIN" - Ejercicios

/*1) ¿Puedes leer el código en este programa y adivinar el resultado
*     (sin ejecutarlo en el Playground de Kotlin)?
*      fun main() {
*            println("1")
*            println("2")
*            println("3")
*        }
*/
Solucion:
            1
            2
            3

/* 2) Usa el Playground de Kotlin para crear un programa que genere los siguientes mensajes:
*
*        I'm
*        learning
*        Kotlin!
*
*
*/
Solucion:
                fun main() {
                    println("I'm")
                    println("learning")
                    println("Kotlin!")
                }

/* 3) Copia y pega este programa en el Playground de Kotlin.
*
*           fun main() {
*               println("Tuesday")
*               println("Thursday")
*               println("Wednesday")
*               println("Friday")
*               println("Monday")
*           }
*    Corrige el programa para que imprima este resultado:
*                    Monday
*                    Tuesday
*                    Wednesday
*                    Thursday
*                   Friday
*/
Solucion:
                fun main() {
                    println("Monday")
                    println("Tuesday")
                    println("Wednesday")
                    println("Thursday")
                    println("Friday")
                }


/* 4) Corrige el error de este programa para que produzca el resultado deseado.
*
*        fun main() {
*                println("Tomorrow is rainy")
*
*    Resultado deseado:
*                   Tomorrow is rainy
*/
Solucion: Faltaba la llave de cierre

                fun main() {
                    println("Tomorrow is rainy")
                }

/* 5) Corrige el error de este programa para que produzca el resultado deseado.
*
*       fun main() {
*          printLine("There is a chance of snow")
*        }
*
*    Resultado deseado:
*            There is a chance of snow
*/
Solucion: Es println, no es printLine

            fun main() {
                println("There is a chance of snow")
            }

/* 6) Corrige el error de este programa para que produzca el resultado deseado.
*
*            fun main() {
*                println("Cloudy") println("Partly Cloudy") println("Windy")
*            }
*       Resultado deseado:
*                Cloudy
*                Partly Cloudy
*                Windy
*/
Solucion: Es una instruccion por linea no todo junto en 1 sola linea
            fun main() {
                println("Cloudy")
                println("Partly Cloudy")
                println("Windy")
            }

/* 7) Corrige el error de este programa para que produzca el resultado deseado.

        fun main() (
            println("How's the weather today?")
        )

    Resultado deseado:
        How's the weather today?
*/
Solucion: Para el body de la funcion se usan llaves no parentesis

            fun main() {
                println("How's the weather today?")
            }






