@file:JvmName("DisplayFunction")

package com.aggreyah
fun main(args: Array<String>){
    display("aggrey")
}

fun display(name:String) : Boolean{
    println("Hello world from $name.")
    return true
}