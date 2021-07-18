package com.aggreyah

import java.math.BigInteger
import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>){
    println(fib(10000))
}

tailrec fun fib(n:Int) : BigInteger {
    var fibs:ArrayList<BigInteger> = ArrayList()
    fibs.add(BigInteger.ONE)
    fibs.add(BigInteger.ONE)
    if (n <= 2){
        return BigInteger.ONE
    }
    else{
        for (i in 2..n){
            fibs.add(fibs.get(i - 1) + fibs.get(i - 2))
        }
        return fibs.get(n - 1)
    }
}
//this did not work as expected.