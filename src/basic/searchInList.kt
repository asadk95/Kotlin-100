package basic
fun main(){

  //  searchinList(listOf(1,5,5,7),5)
    val list = intArrayOf(4,8,9,7)
    searchinList2(55,*list)
    searchinList2(55,4,8,7,55)
}
fun searchinList(list:List<Int>,index:Int){

    println("The list looks like the following: $list")
    println("Search for this number: ")
  //  val n= readln().toInt()

    if (list.contains(index)){
        println("The index of $index is ${list.indexOf(index)}")
    }else
        println("The index of $index is -1")


}
fun searchinList2(index:Int,vararg list:Int){

    print("The list looks like the following: ")
    list.forEach { print("$it ")  }
println("")
    println("Search for this number: ")
  //  val n= readln().toInt()

    if (list.contains(index)){
        println("The index of $index is ${list.indexOf(index)}")
    }else
        println("The index of $index is -1")


}