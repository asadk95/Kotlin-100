package others

fun main(){


    val arrayList = arrayOf(1,2,1,2,44,5)
    val mutableArrayList = mutableListOf(1,2,1,2,44,5)

    val list = listOf(1,2,1,2,1,44,5)
    val mutableList = mutableListOf(1,2,1,2,1,44,5)

    val set = setOf(1,2,1,2,44,5)
    val mutableSet = mutableSetOf(1,2,1,2,44,5)

    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    val mutableMap = mutableMapOf(1 to "one", 2 to "two", 3 to "three")

    val hashMap = hashMapOf(1 to "one", 2 to "two", 3 to "three")
    val mutableHashMap = mutableMapOf(1 to "one", 2 to "two", 3 to "three")

//    val linkedList = linkedListOf(1,2,1,2,44,5)
//    val mutableLinkedList = mutableLinkedListOf(1,2,1,2,44,5)

//    val numbers= listOf(1,2,4,5,7,5)
//    println(" First item in list is ${numbers.first()} and last item in list is ${numbers.last()}")
//println("All Elements in List: ")
   /* for(i in numbers){
        print("$i ")
    }*/
//    numbers.forEach {
//        print("$it ")
//    }

//    val ageOfBrothers = mapOf("Nawaz" to 34, "Asad" to 31, "Aon" to 28, "Hassan" to 19,
//        "Saifullah" to 17)
//    for((name,age)in ageOfBrothers){
//        println("Mr.$name is $age years old.")
//    println("Enter Number: ")
//    var num = readLine()!!.toInt()
//    var i=num
//
//    while (num>0){
//
//        println(num)
//        num--
//    }
numberPower()

    }

fun numberPower(){
    println("Enter first Number: ")
    val num1= readLine()!!.toInt()
    println("Enter 2nd Number: ")
    val num2 = readLine()!!.toInt()
    val power =Math.pow(num1.toDouble(),num2.toDouble()).toInt()
    println("Power of $num1 and $num2 is $power")
}

//    ageOfBrothers.forEach {
//        println("${it.key} is ${it.value} years old")
//    }
//}