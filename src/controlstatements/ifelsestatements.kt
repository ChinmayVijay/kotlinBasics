package controlstatements

fun main(args:Array<String>){
    val a = 5
    val b = 6
    if(a > b){
        println(true)
    }
    else{
        println(false)
    }

    //If as expressions
    var maxValue :Int = if(a>b) a else b

    println(maxValue)

    var minValue:Int = if(a<b){
                            println("a is smaller")
                            a//this gets assigned ; last statement gets assigned
                        } else{
                            println("b is smaller")
                            b
                        }

    println(minValue)
}