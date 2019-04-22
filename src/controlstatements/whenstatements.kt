package controlstatements

fun main(args:Array<String>){
    //switch-case --->> when
    val x = 6
    //simple when statement - analogy to switch in java
    when (x){
        0,1,3 -> println("x is 0, 1 or 3") //multiple cases can be checked at once by separating over comma
        2 -> {
            println("x is 2") // can use braces to write multiple statements
        }
        in 4..9 -> println("x is in between 4 and 9")
        else -> { // this a defau lt case
            println("value of x is unknown")
            println("I really dont know what is x")
        }
    }

    val y=20
    var str = ""

    when(y){

        20 -> str = "x is 20"
        21 -> str = "x is 21"
        else -> {
            str = "None"
        }
    }

    println(str)

    val expr:String = when(x){
        1-> "x is 1"
        2-> "x is 2"
        else -> {
            "x value unknown" //unused code
            "x is an alien"
        }
    }

    println(expr)





}