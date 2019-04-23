@file:JvmName("MyCustomFileName")
package interoperability

fun main(args:Array<String>){
    var sum = MyJavaFile.add(5,8)
    println(sum)

    var volume = findVolume(2,3)
    println(volume)
    println(findVolume(2,5,30))
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