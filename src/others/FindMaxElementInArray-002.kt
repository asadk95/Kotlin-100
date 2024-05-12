package others

fun findMaxElement(array:IntArray):Int{

    var max=array[0]

for (element in array){

    if (element>max){
        max=element
    }
}

return max
}
fun main()
{
val numbers= intArrayOf(11,55,5,51,66,4)
    val num2= arrayOf(1..100)
    println("Maximum elements in array: ${findMaxElement(numbers)}")


}