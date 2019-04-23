package oops

class Testing{

    fun main(args:Array<String>){
        var person = Person()
        println(person.d) //accessible
        println(person.c) //accessible
//        println(person.b) //not accessible
//        println(person.a) //not accessible
    }


}

open class Person{
    private val a:Int = 1
    protected val b:Int = 2
    internal val c:Int = 3
    val d:Int = 4
}

class Indian:Person(){
    fun test(){
        println(d) //visible
        println(c) //visible
        println(b) //visible
//        println(a) //not visible
    }
}