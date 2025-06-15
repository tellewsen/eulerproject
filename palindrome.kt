/*
 * Solves https://projecteuler.net/problem=4
 */
fun isPalindrome(n: Int): Boolean {
    var original = n
    var reversed = 0

    while (original > 0) {
        val digit = original % 10
        reversed = reversed * 10 + digit
        original /= 10
    }

    return n == reversed
}

fun isPalindromeString(n: Int): Boolean {
    val b = n.toString()
    return b == b.reversed()
}

fun main() {
    var maxpal = 0
    for (i in 100..999) {
        for (j in 100..999) {
            val a = i * j
            if (isPalindrome(a)) {
                maxpal = maxOf(maxpal, a)
            }
        }
    }
    println("$maxpal")
}
