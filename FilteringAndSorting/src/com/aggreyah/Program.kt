package com.aggreyah

fun main(args: Array<String>){
    val ints = listOf<Int>(1, 2, 3, 4, 5, 6)
    val smallInts = ints.filter { it < 4 }

//    for (i: Int in smallInts) println(i)

    val squaredInts = ints.map { it * it }

//    for (i: Int in squaredInts) println(i)

    val smallSquaredInts = ints.filter { it < 5 }.map { it * it }
    for (i: Int in smallSquaredInts) println(i)

    val meetings = listOf<Meeting>(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))
}

class Meeting(val id: Int, val title: String){}