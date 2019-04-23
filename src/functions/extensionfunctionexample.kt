package functions

fun main(args:Array<String>){

    var str1 = "Hello"
    var str2 = "World"

    var str3 = "Hey"
    //In kotlin every thing acts as an object
    //here str3 acts as an object of String class
    println(str3.add(str1,str2))

    val x:Int = 12
    val y:Int = 13

    println(x.greaterValue(y))


}
//extension function
fun String.add(s1:String,s2:String):String{
    return this + s1 + s2
}

//Extension function as expression
fun Int.greaterValue(other:Int):Int =   if(this > other)
                                            this
                                        else
                                            other