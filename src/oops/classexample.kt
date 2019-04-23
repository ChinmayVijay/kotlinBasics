package oops

fun main(args:Array<String>){

    var aven = Avengers("Iron Man")
    var dcchar  = JusticLeague("Wonder Woman")
}

class Avengers(_name:String){
    var name:String=""
    init {
        this.name = _name
        println("Name of Avenger is $name")
    }
}

class JusticLeague(var name:String){
    init {
        println("Member of Justice League is $name")

    }
}