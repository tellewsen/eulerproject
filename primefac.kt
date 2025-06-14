/*
* Solves https://projecteuler.net/problem=3 
*/
fun primeFactors(n: Long): List<Long> {
    var number = n
    val factors = mutableListOf<Long>()
    var divisor = 2L
    // d*d<n is more performant than d<sqrt(n)
    while (divisor * divisor <= number) {
        // Make sure we don't skip multiple of the same factor
        while (number % divisor == 0L) {
            factors.add(divisor)
            number /= divisor
        }
        divisor++
    }

    if (number > 1) {
        factors.add(number)
    }

    return factors
}

fun main() {
    val num = 600851475143
    val factors = primeFactors(num)
    println("Prime factors of $num are: $factors")
}
