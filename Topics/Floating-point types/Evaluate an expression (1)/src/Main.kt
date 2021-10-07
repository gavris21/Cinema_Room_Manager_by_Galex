const val CONST1 = 10.5
const val CONST2 = 4.4
const val CONST3 = 2.2
fun main() {
    // put your code here
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val c = readLine()!!.toDouble()
    val d = readLine()!!.toDouble()
    val result = a * CONST1 + b * CONST2 + (c + d) / CONST3
    println(result)
}