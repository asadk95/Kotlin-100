package basic

import java.util.TreeMap

fun main(){

    celsiustoFahrenheit(10.0)


}

fun celsiustoFahrenheit(temp: Double){
    //F = (°C × 9/5) + 32
    val fahrenheit = (temp * (9/5)) + 32
    //println(fahrenheit::class.java)

    println("$temp Celsius is equal to $fahrenheit Fahrenheit")

   
}