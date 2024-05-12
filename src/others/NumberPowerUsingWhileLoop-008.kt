package others

fun main() {


    /*

        println("Enter 1 Number: ")
        var x = readLine()?.toInt()
        println("Enter 2nd Number: ")
        var y = readLine()?.toInt()
        var result = 1
        var i = 0
        while (x != null && y != null && i < y) {
            result *= x
            i++

        }
        println("$x to the power of $y is $result")

    }*/

/*
    val list = mutableListOf<Int>()
    println("Enter 5 Numbers: ")
    for (i in 1..5) {

        var x = readlnOrNull()?.toInt()
        if (x!=null)
        list.add(x)

    }

    println("Elements in List:( $list )")
    println("Reversed Elements in List:( ${list.reversed()} )")*/



    // Sum of all elements in Array
    val array = arrayOf(1,5,8,4,8)
    var result=0
    for (i in array){
        result+=i
    }
    println("Sum of all elements in Array: $result")
}

