fun main(args:Array<String>){

    var name="Steve"
//    println(name)
    display(name)

    var number = 10
    println(number)

    var num = 10.0
    println(num)

    //Object Creation
    var personObj = Person()
    personObj.display(name)

}

fun display(name:String){
    println(name)
}

class Person {
    fun display(name:String){
        println(name)
    }
}