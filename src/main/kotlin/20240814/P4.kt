package `20240814`

//Problem 5 「最小の倍数」
//2520 は 1 から 10 の数字の全ての整数で割り切れる数字であり, そのような数字の中では最小の値である.
//
//では, 1 から 20 までの整数全てで割り切れる数字の中で最小の正の数はいくらになるか.

fun main() {
    val startTime = System.currentTimeMillis()
    var n = 1

    while (true) {
        var isDivisible = true

        for (i in 1..20) {
            if (n % i != 0) {
                isDivisible = false
                break
            }
        }

        if (isDivisible) {
            println(n)
            break
        }

        n++
    }
    val endTime = System.currentTimeMillis()
    println(endTime - startTime)
}