package oops

fun main(args:Array<String>){
    var dogObj = Dog()
    dogObj.color="white"
    dogObj.breed="Dalmation"
    println("The dog is ${dogObj.color} and ${dogObj.breed}")
    dogObj.eat()
    dogObj.bark()
}


open class Animal{
    var color:String=""

    fun eat(){
        println("Eat")
    }
}


class Dog:Animal(){
    var breed:String=""
    fun bark(){
        println("Woof!!")
    }
}

class Cat:Animal(){
    var age:Int = -1
    fun meow(){
        println("Meow..!")
    }
}