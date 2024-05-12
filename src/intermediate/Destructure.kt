package intermediate

import java.time.LocalDate

fun main() {
    /*

        data class User(val name:String,val age:Int)

        val user =User("Asad",30)
        val(userName,userAge)=user

        println(user.component1())
        user.component2()
      //  println("$userName is $userAge years old")

    */
    operator fun LocalDate.component1() = year
    operator fun LocalDate.component2()=monthValue
    operator fun LocalDate.component3()= dayOfMonth

    val today = LocalDate.parse("2024-03-18")
    val (year, month, day) = today
    println("$year $month $day")

}