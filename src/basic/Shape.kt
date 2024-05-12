package basic

open class Shape(var name: String) {


    init {
        println("I am super class calling")
    }

    fun changeName(newName: String) {
        name = newName

    }

}