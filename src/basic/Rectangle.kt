package basic

class Rectangle(val a:Double,val b:Double):Shape("Rectangle") {

    init {
        println("$name created with a = $a and b = $b")
        println("Area of $name is ${area()}")
        println("Perimeter of $name is ${perimeter()}")
        println("Is $name a Square? ${isSquare()}")
    }

    fun area()= a*b
    fun perimeter()=2*a+2*b // 2(a+b)
    fun isSquare()=a==b
}