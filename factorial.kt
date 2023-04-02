fun main() {
    val num = 5
    var factorial = 1
    for (i in 1..num) {
        factorial *= i
    }
    println("Factorial of $num = $factorial")
}
