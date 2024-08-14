package `20240814`

//Problem 6 「二乗和の差」
//最初の10個の自然数について, その二乗の和は,
//
//12 + 22 + ... + 102 = 385
//最初の10個の自然数について, その和の二乗は,
//
//(1 + 2 + ... + 10)2 = 3025
//これらの数の差は 3025 - 385 = 2640 となる.
//
//同様にして, 最初の100個の自然数について二乗の和と和の二乗の差を求めよ.

fun main() {
    var sum1 = 0
    for (i in 1..100) {
        sum1 += i * i
    }
    var n = 0
    for (i in 1..100) {
        n += i
    }
    println(n * n - sum1)
}