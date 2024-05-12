package basic

fun main(){

    val result=::evenOdd
    println(result(5))
}
fun evenOdd(num:Int):String{


    return if (num%2==0)
        "Even"
    else
        "Odd"
}
