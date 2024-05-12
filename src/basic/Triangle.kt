package basic

import kotlin.math.sqrt

class Triangle(val a:Double, val b:Double, val c:Double):Shape("Triangle") {


    init {
        println("$name created with a = $a , b =$b, c = $c")
        println("Area of $name is ${area()}")
        println("Perimeter of $name is ${perimeter()}")
    }
    fun perimeter()=a+b+c
    fun area()= sqrt((perimeter()/2)*(perimeter()/2-a)*(perimeter()/2-b)*(perimeter()/2-c))

}