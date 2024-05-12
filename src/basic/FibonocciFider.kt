package basic

fun main() {


    val list = mutableListOf(0, 1)
    println("Enter a number n > 1: ")
    val n = readLine()!!.toInt()
    for (i in 2..n - 1) {

        list.add(list[i - 2] + list[i - 1])
    }
    println(list)

}