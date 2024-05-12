package basic

fun main() {
    val map1= mapOf(1 to "one", "two" to 2)
    println(map1)
    println(map1.keys)
    println(map1.values)
    println("Map key is ${map1.keys} and it's value is ${map1.values} and it's size is ${map1.size} and " +
            "it's type is ${map1::class.simpleName} and it's hashcode is ${map1.hashCode()}" +
            " and it's entry is ${map1.entries} ")
}