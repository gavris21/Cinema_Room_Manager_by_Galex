const val ANSWER = 42
fun main() {
    val answer: Int = try {
        readLine()!!.toInt()
    } catch (e: Exception) {
        ANSWER
    } finally {
        println("The answer is a number")
    }
    println(answer)
}