@file:JvmName("MyCustomFileName")
package interoperability

fun main(args:Array<String>){
    var sum = MyJavaFile.add(5,8)
//    println(sum)

    var volume = findVolume(2,3)
//    println(volume)
//    println(findVolume(2,5,30))
    printLBH(2,3)
    printLBH(4,5,6) //overrides the default value
}

fun add(a:Int,b:Int):Int{
    return a+b
}

//default functions
//use annotation @JvmOverloads for interoperability from java file
@JvmOverloads
fun findVolume(length:Int, breadth: Int, height:Int = 10):Int{
    return length * breadth * height
}

//Named Parameters example
fun printLBH(length:Int,breadth:Int, height:Int=10){
    println("length is: $length")
    println("breadth is: $breadth")
    println("length is: $height")

}