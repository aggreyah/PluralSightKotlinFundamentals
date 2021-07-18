package com.aggreyah

fun main(args: Array<String>){
    var h1: Headers = Headers("H1")
    var h2: Headers = Headers("H2")
    println("New header: ${(h1 add h2).Name}")
}

class Headers (var Name:String){}

infix fun Headers.add(Other:Headers) : Headers{
    return Headers(this.Name + Other.Name)
}