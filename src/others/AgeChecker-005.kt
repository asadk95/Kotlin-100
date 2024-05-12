package others

fun main() {
    println("Please Enter Your age: ")
    val age = readlnOrNull()?.toInt()

    if (age != null) {


    if (age in 0..17) {
        println("You are not eligible to vote")
    } else if (age in 18..65) {
        println("You are eligible to vote")
    } else if (age > 65) {
        println("You are too old to vote")

    } else {
        println("Invalid age")
    }
}


}