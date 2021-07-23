package com.aggreyah

fun main(args: Array<String>){
    var fibObj = Program()
    var total = 0
//    fibObj.fibonacci(10, object : Process {
//        override fun execute(value: Int) {
//            println(value)
//        }
//    })
//    fibObj.fibonacci(10) { n -> println(n) }
//    fibObj.fibonacci(10) {println(it)}
//    fibObj.fibonacci(8, ::println)

    fibObj.fibonacci(10){total += it}
    println(total)
}

interface Process{
    fun execute(value: Int)
}

class Program {

    fun fibonacci (limit: Int, action: (Int) -> Unit){
        var prevprev = 0
        var prev = 0
        var current = 1

        for (i: Int in 1..limit){
            action(current)

            prevprev = prev
            prev = current
            current = prev + prevprev
        }
    }

    fun fibonacci (limit: Int, action: Process){
        var prevprev = 0
        var prev = 0
        var current = 1

        for (i: Int in 1..limit){
            action.execute(current)

            prevprev = prev
            prev = current
            current = prev + prevprev
        }
    }

}