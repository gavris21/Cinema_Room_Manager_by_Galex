fun parseCardNumber(cardNumber: String): Long {
    when {
        cardNumber.length != 19 -> throw Exception("Not correct length")
        cardNumber[4] != ' ' -> throw Exception("Must be space after 4 digit")
        cardNumber[9] != ' ' -> throw Exception("Must be space after 8 digit")
        cardNumber[14] != ' ' -> throw Exception("Must be space after 12 digit")
        cardNumber.filterNot { it.isWhitespace() }.toLongOrNull() == null -> throw Exception("Acceptable only digits")
    }
    return cardNumber.filterNot { it.isWhitespace() }.toLong()
}