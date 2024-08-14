package `20240814`

//左右どちらから読んでも同じ値になる数を回文数という. 2桁の数の積で表される回文数のうち, 最大のものは 9009 = 91 × 99 である.
//
//では, 3桁の数の積で表される回文数の最大値を求めよ.

fun main() {
    var result = 0

    for (i in 100..999) {
        for (j in i..999) {
            val product = i * j
            val productStr = product.toString()
            val reversedStr = productStr.reversed()

            if (productStr == reversedStr && product > result) {
                result = product
            }
        }
    }

    println(result)
}