//Problem 1 「3と5の倍数」
//10未満の自然数のうち, 3 もしくは 5 の倍数になっているものは 3, 5, 6, 9 の4つがあり, これらの合計は 23 になる.
//
//同じようにして, 1000 未満の 3 か 5 の倍数になっている数字の合計を求めよ.

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