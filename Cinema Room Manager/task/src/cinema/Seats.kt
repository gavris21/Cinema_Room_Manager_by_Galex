package cinema

const val SEATS_PER_ROW = 8
const val TOTAL_ROWS = 7

class Seats {
    private var room = MutableList(TOTAL_ROWS) { MutableList(SEATS_PER_ROW) { 'S' } }
    var purchasedTickets = 0
    var currentIncome = 0
    var totalIncome = 0
    fun drawRoom() {
        println("""
            Cinema:
              ${(1..room[0].size).joinToString(" ")}
        """.trimIndent())
        for (i in room.indices) {
            print("${i + 1} ${room[i].joinToString(" ")}\n")
        }
        println()
    }

    fun changeRowSeats () {
        println("Enter the number of rows:")
        val rows = readLine()!!.toInt()
        println("Enter the number of seats in each row:")
        val seats = readLine()!!.toInt()
        room = MutableList(rows) { MutableList(seats) { 'S' } }
        println()
    }

    fun calculate () {
        val rows = room.size
        val seats = room[0].size
        totalIncome = if (rows * seats <= 60) {
            rows * seats * 10
        } else {
            rows / 2 * seats * 10 + (rows - rows / 2) * seats * 8
        }
    }

    fun buyTicket() {
        println("Enter a row number:")
        val row = readLine()!!.toInt()
        println("Enter a seat number in that row:")
        val seat = readLine()!!.toInt()
        when {
            (row - 1) !in room.indices -> {
                println("\nWrong input!\n")
                buyTicket()
                return
            }
            (seat - 1) !in room[row - 1].indices -> {
                println("\nWrong input!\n")
                buyTicket()
                return
            }
            room[row - 1][seat - 1] == 'B' -> {
                println("\nThat ticket has already been purchased!\n")
                buyTicket()
                return
            }
        }
        room[row - 1][seat - 1] = 'B'
        val rows = room.size
        val seats = room[0].size
        val ticket = if (rows * seats <= 60) {
            currentIncome += 10
            10
        }
        else { if (row <= rows / 2) {
            currentIncome += 10
            10
        } else {
            currentIncome += 8
            8
        }
        }
        purchasedTickets++
        println("\nTicket price: $$ticket\n")
    }

    fun menu() {
        var temp = true
        while (temp) {
            println("""
                1. Show the seats
                2. Buy a ticket
                3. Statistics
                0. Exit
            """.trimIndent())
            when (readLine()!!.toInt()) {
                1 -> {
                    println()
                    drawRoom()
                }
                2 -> {
                    println()
                    buyTicket()
                }
                3 -> {
                    println()
                    statistics()
                }
                0 -> temp = false
            }
        }
    }

    fun statistics() {
        calculate()
        println("""
            Number of purchased tickets: $purchasedTickets
            Percentage: ${String.format("%.2f", (purchasedTickets.toDouble() / (room.size * room[0].size) * 100))}%
            Current income: $$currentIncome
            Total income: $$totalIncome
            
        """.trimIndent())
    }
}