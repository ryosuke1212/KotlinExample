package `20240731`


fun main() {
    fun sumOfMultiples(limit: Int): Int {
        var sum = 0
        for (i in 1 until limit) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i
            }
        }
        return sum
    }

    var result = sumOfMultiples(1000)
    println(result)
}