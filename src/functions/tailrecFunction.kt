package functions

import java.math.BigInteger

fun main(args:Array<String>){

    println(fibonacci(10000, BigInteger("1"), BigInteger("0")))
}

tailrec fun fibonacci(n:Int, a:BigInteger, b:BigInteger):BigInteger{
    return if(n==0) b else fibonacci(n-1,a+b,a)
}

/*
Kotlin Tail Recursion
Tail recursion is a generic concept rather than the feature of Kotlin language.
 Some programming languages including Kotlin use it to optimize recursive calls,
  whereas other languages (eg. Python) do not support them.

In normal recursion, you perform all recursive calls first, and calculate the result from return values at last (as show in the above example).
 Hence, you don't get result until all recursive calls are made.

In tail recursion, calculations are performed first, then recursive calls are executed (the recursive call passes the result of your current step
 to the next recursive call). This makes the recursive call equivalent to looping, and avoids the risk of stack overflow.

Condition for tail recursion
A recursive function is eligible for tail recursion if the function call to itself is the last operation it performs.
 */