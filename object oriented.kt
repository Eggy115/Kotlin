open class Shape(val color: String) {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(color: String, val radius: Double) : Shape(color) {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Rectangle(color: String, val width: Double, val height: Double) : Shape(color) {
    override fun area(): Double {
        return width * height
    }
}

fun main() {
    val shapes = listOf(
        Circle("Red", 5.0),
        Rectangle("Blue", 4.0, 6.0),
        Circle("Green", 3.0)
    )
    for (shape in shapes) {
        println("Area of ${shape.color} ${shape::class.simpleName}: ${shape.area()}")
    }
}
