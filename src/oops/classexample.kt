package oops

fun main(args:Array<String>){

    var aven = Avengers("Iron Man")
    var dcchar  = JusticLeague("Wonder Woman")
    var dcChar2 = JusticLeague("Aqua Man", 10)
    println("id is: ${dcChar2.id}")
}

class Avengers(_name:String){
    var name:String=""
    init {
        this.name = _name
        println("Name of Avenger is $name")
    }
}

class JusticLeague(var name:String){

    var id:Int = -1
    init {
        println("Member of Justice League is $name")
//        println("Member of Justice League is $name and id is: $id")
        //this statement will not print the correct value of id
        //as the init block gets executed with primary constructor
        //and the id field is initialized inside the secondary constructor
        //after the init has been executed

    }
    constructor(n:String, id:Int):this(n){
        this.id = id
    }
}