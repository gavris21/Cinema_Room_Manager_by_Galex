const val G_CONST = 9.8

fun main() {
    // write your code here
    val d = readLine()!!.toDouble()
    val h = readLine()!!.toDouble()
    val p = d * G_CONST * h
    println(p)
}