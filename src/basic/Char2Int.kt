package basic

import java.math.BigInteger

fun main(){
    char2Int(1234567890123456780)

/*    val msg ="""
        Hello,
        I am Muhammad Asad,
        I am Android Developer.
    """.replaceIndent("msg-> ")
    println(msg)*/

}
fun char2Int(intNumber:Long){
    var alphaInt = 0
    var alpha: Char = intNumber.toInt().toChar()
    println("Number $intNumber is in character: ' $alpha ' ")

}
// inner functions
fun sayHi(){
    println("Hi")
    fun bye(){
        println("Bye")
    }
    bye()
}
