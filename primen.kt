/*
 * Solves https://projecteuler.net/problem=7
 */
fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    if (n == 2) return true
    if (n % 2 == 0) return false
    for (i in 3..Math.sqrt(n.toDouble()).toInt() step 2) {
        if (n % i == 0) return false
    }
    return true
}

fun main() {
    val target_n = 10001
    var primes_found = 0
    var candidate = 1
    while (primes_found < target_n) {
        candidate++
        if (isPrime(candidate)) primes_found++
    }

    if (primes_found == target_n) {
        println("Prime number $target_n is $candidate")
        return
    }
}
