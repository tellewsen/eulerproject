/**
* Solves https://projecteuler.net/problem=2
**/


fun main(){
    val limit = 4_000_000
    var a = 1
    var b = 1
    var c= 0
    var sum = 0
    while(b < 4_000_000){
        c = a+b
        a = b
        b = c
        if (b %2 == 0){
            sum += b
        }
    }
    println("Sum of the even-valued terms below $limit is: $sum ")
}