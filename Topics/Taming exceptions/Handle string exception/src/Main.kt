fun main() {
    val index = readLine()!!.toInt()
    val word = readLine()!!
    if (index < word.length && word.isNotEmpty() && index >= 0) {
        println(word[index])
    } else {
        println("There isn't such an element in the given string, please fix the index!")
    }
}