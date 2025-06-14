"""
Solves https://projecteuler.net/problem=1
"""
fun main() {
    val limit = 1000
    val sum = (1 until limit)
        .filter { it % 3 == 0 || it % 5 == 0 }
        .sum()

    println("Sum of multiples of 3 or 5 below $limit is: $sum")
}
