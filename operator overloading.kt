data class Vector(val x: Int, val y: Int) {
    operator fun plus(other: Vector) = Vector(x + other.x, y + other.y)
}

fun Vector.distance() = Math.sqrt((x * x + y * y).toDouble())

fun main() {
    val v1 = Vector(3, 4)
    val v2 = Vector(5, 6)
    val v3 = v1 + v2
    println(v3.distance())
}
