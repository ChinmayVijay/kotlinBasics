package oops

fun main(args:Array<String>){
    var verna = Car("white","Hyundai")
    println("Car is ${verna.color} and of ${verna.brand}")

}

open class Vehicle{
    var color:String=""

    constructor(color:String){
        this.color = color
    }
}

class Car: Vehicle{
    var brand:String = ""

    constructor(color:String, brand:String):super(color){
        this.brand = brand
    }
}