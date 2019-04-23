package oops

fun main(args:Array<String>){
//    var dogObj = Dog()
//    dogObj.color="white"
//    dogObj.breed="Dalmation"
//    println("The dog is ${dogObj.color} and ${dogObj.breed}")
//    dogObj.eat()
//    dogObj.bark()

    var dog2 = Dog()
    dog2.eat()
    println(dog2.color)

    var cat2 = Cat()
    cat2.eat()

    var anim = Animal()
    anim.eat()
}


open class Animal{
    open var color:String="White"

    open fun eat(){
        println("Animal Eating")
    }
}


class Dog:Animal(){
    override var color:String = "Black"
    var breed:String=""
    fun bark(){
        println("Woof!!")
    }
    override fun eat(){
        println("Dog is eating")
    }
}

class Cat:Animal(){
    var age:Int = -1
    fun meow(){
        println("Meow..!")
    }
    override fun eat(){
        println("Cat is eating")
    }
}