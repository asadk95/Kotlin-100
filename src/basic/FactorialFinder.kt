package basic

fun main(){

    println(factorialFinder(3))
}
fun factorialFinder(n:Int):Int{
    var fact=1
    for (i in 1..n){

        fact*=i
    }
    return fact
}