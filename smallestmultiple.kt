/*
 * Solves https://projecteuler.net/problem=5
 *
 * This one we're going to solve by prime factorization
 * 20=5*2*2
 * 19
 * 18=3*3*2
 * 17
 * 16=2*2*2*2
 * 15=3*5
 * 14=7*2
 * 13
 * 12=2*2*3
 * 11
 * 10=2*5
 * 9=3*3
 * 8=2*2*2
 * 7
 * 6=3*2
 * 5
 * 4=2*2
 * 3
 * 2
 * 1
 * So we want to be able to make all these numbers, which means we need to have a number with the max of the factors
 * which when going from top to bottom gives us
 * 5*2*2*19*3*3*17*2*2*7*13*11*7
 */
fun main() {
    println(5 * 2 * 2 * 19 * 3 * 3 * 17 * 2 * 2 * 7 * 13 * 11)
}
