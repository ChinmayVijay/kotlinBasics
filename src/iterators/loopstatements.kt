package iterators

fun main(args:Array<String>){
    //break statement
    //labelled for loop

    myLoop@ for(i in 1..3){
        for(j in 1..3){
            println("$i $j")
            if(i==2 && j==2)
                break@myLoop
        }
    }

    //continue
    for(k in 1..6){
        if(k == 5)
            continue
        println(k)
    }

    //return
    for(c in 1..5){
        if( c==4){
            return
        }
        println(c)
    }


}