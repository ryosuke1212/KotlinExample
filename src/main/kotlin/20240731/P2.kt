//Problem 2 「偶数のフィボナッチ数」
//フィボナッチ数列の項は前の2つの項の和である. 最初の2項を 1, 2 とすれば, 最初の10項は以下の通りである.
//
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//数列の項の値が400万以下のとき, 値が偶数の項の総和を求めよ.

package `20240731`

fun main() {
    val limit = 4000000
    var a = 1
    var b = 2
    var sum = 0

    while (a <= limit) {
        if (a % 2 == 0) {
            sum += a
        }
        val c = a + b
        a = b
        b = c
    }
    println(sum)
}
