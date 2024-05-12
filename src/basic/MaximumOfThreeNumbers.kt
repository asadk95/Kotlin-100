package basic

fun main() {
    // Find the maximum of three numbers.

val list = listOf(4,8,6)
    var max=list[0]
    for (i in list){

        if (i>max)
            max=i
    }

    println("list.max() is $max")

    val num1=77
    val num2=99
    val num3=45
    max=num1
    if (num2>max)
        max=num2
    if (num3>max)
        max=num3

    println("Maximum of $num1  $num2 and $num3 is $max")

}