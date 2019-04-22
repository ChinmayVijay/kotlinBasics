package functions

fun main(args:Array<String>){

    add()
    add(2,8)
    var sum = add(3,4,5)
    println("Sum is "+sum)

    var largeValue = max(4,9)
    println("The greater value is "+largeValue)
}

fun add(){
    var a = 4
    var b = 5
    println("Sum is ${a + b}")
}
fun add(a:Int, b:Int){
    println("Sum is ${a + b}")
}

fun add(a:Int, b:Int,c:Int):Int{
    return a+b+c
}

//function as an expression
fun max(a:Int, b:Int):Int = if(a>b) a else b