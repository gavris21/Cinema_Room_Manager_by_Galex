import kotlin.math.pow

fun main() {
    // put your code here
    val x = readLine()!!.toDouble()
    val result = x.pow(3) + x.pow(2) + x + 1
    println(result)
}