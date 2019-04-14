package datatypes

fun main(args:Array<String>){
    val name= "Sam"
    val str = "Hello $name"

    println("using string interpolation $str . The number of characters in statement is ${str.length}")

    val a = 10
    val b = 5

    println("The sum of $a and $b is ${a+b}")

    var rect = Rectangle(7,8)
    rect.printRectangleDetails()
}

class Rectangle(var l:Int, var b:Int){
   fun printRectangleDetails(){
       println("The length of rectangle is $l and breadth is $b. The area of rectangle is ${l*b}")
   }
}