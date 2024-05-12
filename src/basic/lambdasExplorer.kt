package basic

fun main() {
    // lambdas Expressions
    val multiply :(Int,Int) -> Int  = { x: Int, y: Int -> x * y }
    val sum = { x: Int, y: Int -> x + y }
    val subtract :(Int,Int)->Int= { x, y-> x - y }
//    println(subtract(55,88))
//    println(multiply(55,88))
//    println(sum(55,88))

    // With Parameters and Return Type
    val greet:(String,String)->String = {name, title -> "$title $name"}
    println(greet("Kotlin","Hello"))

    // With Parameters and No Return Type
    val printSum = { x: Int, y: Int -> println(x+y) }
    printSum.invoke(452,89)


    // No Parameter but Return Type
    val getTime: ()->Long = { System.currentTimeMillis() }
   println( getTime.invoke())

    // No Parameters and No Return Type
    val printHello = { println("Hello Asad") }
    printHello.invoke()

    // Direct Use of Lambda Expression
    println({ x: Int, y: Int -> x * y }(5, 6))
}