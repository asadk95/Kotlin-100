package others

fun main(){

/*    for (i in 1..100 step 9){
        print(" $i")
    }*/

/*    for (i in 50 downTo 1 step 2){
        print(" $i")
    }*/

/*    print("\n")
    for (i in 'a'..'z'){
        print(" $i")
    }*/

/*    print("\n")
    for (i in 'A'..'Z'){
        print(" $i")
    }*/

 /*   val myArray = arrayOf(5,880,44,55,78,98,66,11,10,7)
    var max= myArray[0]
    for (item in myArray){

        if (item > max){
            max=item
        }
    }
    println("Max Item is $max")*/




/*    val ageList= arrayOf(1,2,3,4,5,6,7,8,9,10)
    var listSum =0
    for(item in ageList){
        listSum+=item
    }
    println("List Sum is $listSum")*/


    println("Enter a number: ")
    var num = readlnOrNull()?.toInt()
    println("Lets Count from $num down to 0")
    while (num!=null &&num>=0){
        println(num)
        num--
    }


}