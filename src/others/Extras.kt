package others

fun main() {
    /*
        val country = readLine()!!.toString()
            .replaceFirstChar() { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        when(country){
            "Pakistan"-> println("Assalam O Alaikum!")
            "India" -> println("Hello India")
            "USA" -> println("Hello USA")
            else -> println("Hello World")
        }*/

    /*
        val list = mutableListOf<Int>()
        println("Enter 5 numbers: ")
        for (i in 1..5){
            val x = readLine()!!.toInt()
            if (x !=null)
            list.add(x)
        }

        println("Elements in List: $list")
        println("The 5 elements in reversed order are: ")

        for (i in list.size-1 downTo 0){
            println(list[i])
        }
        */


/*
    val list = mutableListOf(0, 1)
    println("Enter a number n >1: ")
    val n = readln().toInt()
    for (i in 2..n-1){
        list.add(list[i-2]+list[i-1])
    }
    println("Fibonacci Series: $list")

    */
    numbersSum(1,5)
}
fun numbersSum(num1:Int,num2:Int){
    var sum=0

    for (i in num1..num2){
        sum+=i
    }
    println("Sum of $num1 to $num2 is: $sum")


}