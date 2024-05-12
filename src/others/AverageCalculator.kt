package others

fun main(){
    println("Enter 5 Numbers: ")
    var average=0.0
    for (i in 1..5){
        var x = readLine()!!.toInt()
        average+=x/5.0
    }
    println("Average is $average")


}