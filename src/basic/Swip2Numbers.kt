package basic

//Swap two numbers without using a temporary variable.
fun main() {
    var num1 = 50
    var num2 = 100

    num1 += num2 //50+100=150
    num2=num1-num2 //150-100=50
    num1 -= num2 //150-50=100
    println("num1=$num1")
    println("num2=$num2")

    // Swap 2 numbers using temporary variable
  val `new-result`: (num1: Int, num2: Int) -> Unit =  ::swap

    println(`new-result`(55,44))
}

fun swap(num1:Int,num2:Int){
    val temp = num1
    val num1a =num2
    val num2a=temp
    println("num1a=$num1a")
    println("num2b=$num2a")

}
