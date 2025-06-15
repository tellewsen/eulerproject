/*
 * Solves https://projecteuler.net/problem=6
 */
fun main() {
    val sumofSquares = (1..100).map { i -> i * i }.sum()
    val theSum = (1..100).sum()
    val squareOfSum = theSum * theSum
    println(squareOfSum - sumofSquares)
}
