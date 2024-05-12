package ConstructorImplementation

open class GeneralRobot(val name: String) {
    var name1: String = ""
    var modelYear: String = "hi"


    fun walk() {
        println("Waliking...")
    }

    fun speak() {
        println("$name is Speaking...")
    }

}

