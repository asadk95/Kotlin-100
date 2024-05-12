package basic

class Human constructor(name:String, age:Int){

    val name:String
    val age:Int

    init {
        this.name=name
        this.age=age
    }
}

class Person(name:String,age:Int){
    val name:String
    val age:Int
    init {
        this.name=name
        this.age=age
    }
}
class Animal(name:String,age:Int){

    constructor(group:String,name:String,age:Int):this(name,age){
        println("Group is $group")
    }


}