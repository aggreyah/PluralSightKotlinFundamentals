@file:JvmName("DisplayFunction")

package com.aggreyah
fun main(args: Array<String>){
    display("aggrey")
    log("Hello from aggrey")
    log(url = "Hello from aggrey")
}

fun display(name:String) : Boolean{
    println("Hello world from $name.")
    return true
}
@JvmOverloads
fun log(url: String, loglevel: Int = 1){
    println(url + loglevel)
}