fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    val doubledNumbers = evenNumbers.map { it * 2 }
    println(doubledNumbers)
}
