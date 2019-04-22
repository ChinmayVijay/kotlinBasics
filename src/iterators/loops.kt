package iterators

fun main(args:Array<String>){

    var j = 0
    var k=0
    for (i in 1 .. 4 ){
        println("Hello using for loop")
    }

    while(j<5){
        println("Hello using while loop")
        j++
    }

    do{
        println("Hello using do while")
        k++
    }while(k<5)

    //Loop Control Statements
    //1. Break
    //2. Continue
    //3. Return

    for(i in 1..5){
        println(i)
        if(i==3)
            break
    }

}