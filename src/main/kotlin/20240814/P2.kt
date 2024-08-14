package `20240814`

//Problem 3 「最大の素因数」
//13195 の素因数は 5, 7, 13, 29 である.
//
//600851475143 の素因数のうち最大のものを求めよ.

fun main() {
    var number = 600851475143
    var largestPrimeFactor = 0L
    var factor = 2L

    while (factor * factor <= number) {
        if (number % factor == 0L) {
            largestPrimeFactor = factor
            number /= factor
        } else {
            factor++
        }
    }

    if (number > largestPrimeFactor) {
        largestPrimeFactor = number
    }

    println(largestPrimeFactor)
}