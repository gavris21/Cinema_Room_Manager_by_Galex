const val K1_FH = 1.8
const val K2_FH = 32.0

fun main() {
    // put your code here
    val tCelsius = readLine()!!.toDouble()
    val tFahrenheit = tCelsius * K1_FH + K2_FH
    println(tFahrenheit)
}