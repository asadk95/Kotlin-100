package intermediate

import javax.xml.stream.events.Characters

fun main() {
    //  multiplyCorrespondingArrays()
    //  threeNumbers()
    //  others()
    val dog1= Dog("tony", -20, "unknown")
     println(dog1.name)
     println(dog1.weight)


}

fun stringCounter() {
    println("Enter a String to count its Letters, Spaces, Numbers and Other: ")
    val str: String = readLine().toString()

    val ch = str.toCharArray()

    var letter = 0
    var num = 0
    var space = 0
    var other = 0

    for (c in ch) {
        if (Character.isDigit(c)) {
            num++
        } else if (Character.isLetter(c)) {
            letter++
        } else if (Character.isSpaceChar(c)) {
            space++
        } else {
            other++
        }


    }
    println("Total Letter: $letter, Total Number: $num, Total Space: $space, Total Other: $other")


}

fun multiplyCorrespondingArrays() {
    var arr1 = arrayOf(1, 5, -8, 2)
    var arr2 = arrayOf(8, 5, -9, -8)
    var result = ""
    for (i in arr1.withIndex()) {

        result += (arr1[i.index] * arr2[i.index])

    }

    print(" $result ")
}

fun threeNumbers() {

    println("Enter 1st Number: ")
    val num1 = readln().toInt()
    println("Enter 2nd Number: ")
    val num2 = readln().toInt()
    println("Enter 3rd Number: ")
    val num3 = readln().toInt()
    if (num1 > num2 && num1 > num3) {
        println("Greater Number is: $num1")
    } else if (num2 > num1 && num2 > num3) {
        println("Greater Number is: $num2")
    } else if (num3 > num1 && num3 > num2) {
        println("Greater Number is: $num3")
    }


}

fun others() {

    val arr = listOf(1, 23, 4, 5)
    for ((index, item) in arr.withIndex()) {
        println("$item has index [$index] present in this list")
    }
}

class Dog(nameParam: String, weightParam: Int,  breedParam: String) {
    var nameParam = "Asad"
    var weight =weightParam
        set(value) {
           if (value > 0) field=value
        }
    var breedParam ="s"
  //  lateinit var dod:Dog
  val name: String
      get() ="Lusy"


}

val dog1 = Dog("tony", 20, "unknown")

val dogs = arrayOf(Dog("Abc", 12, "df"), Dog("Asc", 55, "Bloody"))
