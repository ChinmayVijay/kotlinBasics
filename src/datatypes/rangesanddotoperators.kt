package datatypes

fun main(args:Array<String>){

    //Ranges
    val r1 = 1..5

    val r2 = 5 downTo 1

    val r3 = 5 downTo 1 step 2

    val r4 = 'a'..'z'

    val isPresent = 'c' in r4

    println(isPresent)


}