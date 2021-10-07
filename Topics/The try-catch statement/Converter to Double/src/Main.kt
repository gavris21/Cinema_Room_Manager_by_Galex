fun convertStringToDouble(input: String): Double {
    var result = 0.0
    try {
        result = input.toDouble()
    } catch (e: Exception) { }
    return result
}