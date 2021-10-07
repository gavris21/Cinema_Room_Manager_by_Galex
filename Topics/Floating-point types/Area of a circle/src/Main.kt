import kotlin.math.pow

const val PI = 3.1415

fun main() {
    // write your code here
    val r = readLine()!!.toInt().toDouble()
    val s = PI * r.pow(2)
    println(s)
}