package functions

fun main(args:Array<String>){

    val x:Int = 14
    val y:Int = 20

    println(x greaterVal y) //infix function can be called as an operator
}

infix fun Int.greaterVal(other:Int):Int = if(this>other)
                                        this
                                    else
                                        other



/*
properties of infix function
1. All Infix functions are extension functions
    but all extension function are not Infix
2. Infix Functions just have one parameter

infix function can be used as an operator while calling the function
for eg:
x greaterVal y
 */
