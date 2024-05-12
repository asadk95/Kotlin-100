package basic

import java.util.Scanner

typealias IntString = List<Int>
typealias MyInt =Int
typealias MyString =String
class Main{
     private lateinit var name:MyString
    fun checkValue(){

        if (this::name.isInitialized){
            println("Value of name is $name")
        }else
        {
            println("Value of name is not initialized")
        }
    }

// Singleton Class

    object Person{

        var name:String = "Asad" // property name
    }

    // Companion Object

    companion object CompanionObject{

        var name2:String = "Asad"
    }



}



fun main() {

   /* val scanner =Scanner(System.`in`)
    val input  = scanner.next().toInt()
    println("input is $input, and it's type is ${input!!::class.simpleName}")
*/

 /*   employeeData(
        name = "John",
        age = 30,
        salary = 5000.0,
        isMarried = true,
        "Developer, Manager"
    )*/

/*   println(Main.Person.name)

    println(Main.name2)
    */


// Pair

    /*    val person =Pair("Muhammad","Asad")
    println(person.first)
    val (name,age)=Pair("Asad",31)
    println(name + age)*/

    /*    val person =Main()
    person.checkValue()
    person.name="Asad"
    person.checkValue()*/

    /*    val number by lazy{ 4}
    println(number)*/

    /*
// Using Triple

    val date =Triple<String,String,String>("Day","Month","Year")
    val dateValue=Triple("09","April","2024")

    println("${date.first} = ${dateValue.first}")
    println("${date.second} = ${dateValue.second}")
    println("${date.third} = ${dateValue.third}")

*/
/*
   hOf(55,88, { a:Int,b:Int->a+b })
    hOf(78,88){a:Int,b:Int ->a+b}
    hOF("Asad",31, { name:String,age:Int -> println("Requested Name is $name and age is $age" )})
//arrayData()

    */

   // getData()
    practice1()
}

fun employeeData(name:String,age:Int,salary:Double,isMarried:Boolean, vararg responsibilities:String) {

    println("Employee Name: $name, Age: $age, Salary: $salary, Marital Status: $isMarried, Responsibilities: ${responsibilities.toList().joinToString()}")
}

fun add(a:Int,b:Int):Int{
    return a+b
}
fun displayData(name:String,age:Int){

    println("Requested Name is $name and age is $age")
}
fun hOF(name:String,age:Int,fn:(String,Int)->Unit){
    return(fn(name,age))

}
fun hOf(a:Int,b:Int,fn:(Int,Int)->Int){

    println(fn(a,b))
}
fun arrayData(){
    val data= arrayOf(4,7,4,7,8,3,2)
    data.forEach {
        print(it)
    }
}

fun getData(){

    println("Enter total number of records: ")
    val totalRecords= readln().toInt()
    println("Enter your name: ")
    val name= Array(totalRecords){ readln() }
    println("Your entered details are: ${name.toList()}")
}

fun practice1() {

    val array1 = arrayOf("asad", 31, 2.56, 'A')
    val array2 = intArrayOf(55, 88, 44)
    var array3 = Array(30) { i-> i*2 !=0 }
//    for(num in array1){
//        println("Array value is $num")
//    }

    val data = listOf("Ayesha",27,44)
    val data1 = mutableListOf(4,7,58,77)
    println(data.size)
    data1.add(79)
    println(data1)
/*    for (i in data.indices){
        println("$i = ${data[i]}")
    }*/
/*    data.forEach{
        println(it)
    }*/

}
fun fun1(isRaining:Boolean,isCold:Boolean){

    
    if(isRaining){
        println("Use Umbrella")
    }

}