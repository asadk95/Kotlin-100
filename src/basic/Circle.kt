package basic

class Circle(val radius:Double):Shape("Shape") {

    val pi=3.141592
    init {
        println("$name created with radius = $radius")
        println("Area of $name is ${area()}")
        println("Perimeter of $name is ${perimeter()}")
    }

    fun area() =pi*radius*radius
    fun perimeter()=2*pi*radius
}