fun intDivision(x: String, y: String): Int {
    var result = 0
    try {
        result = x.toInt() / y.toInt()
    } catch (e: ArithmeticException) {
        println("Exception: division by zero!")
    } catch (e: NumberFormatException) {
        println("Read values are not integers.")
    }
    return result
}

fun main() {
    val x = readLine()!!
    val y = readLine()!!
    println(intDivision(x, y))

}