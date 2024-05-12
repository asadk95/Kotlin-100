package basic

fun main(){

val result2 =sum(111,111)
    println(" $result2")
    println("Enter 1st Number: ")
    val num1= readln().toInt()
    println("Enter 2nd Number: ")
    val num2 = readLine()!!.toInt()
    var result =num1+num2
    println("Result: $result")
}

fun sum(num1:Int,num2:Int):Int{
    return num1+num2
}