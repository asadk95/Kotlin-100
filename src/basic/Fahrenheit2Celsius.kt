package basic

fun main(){

    fahrenheit2Celsius()
}
fun fahrenheit2Celsius(){

    //C = (°F - 32) × 5/9
    println("Enter the temperature in Fahrenheit: ")
    val temp = readln().toDouble()
    val celsius = (temp - 32) * 5/9
    println("$temp Fahrenheit is equal to $celsius Celsius")


}