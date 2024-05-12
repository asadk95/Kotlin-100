package others

fun main() {
    var str: String = "I am Kotlin Developer!"
    println(str.uppercase())
    println(str.uppercase().reversed())
    val simpleExpression=3 > 4 || 4 > 3 && 4 <= 4
    println(simpleExpression)

    val bool=true;
    val x=9
    val y= 3
    val z =9
    val hardexpression=!(x !=z) && bool || z>(x+y)&& (!bool || y<z)
    println(hardexpression)


}