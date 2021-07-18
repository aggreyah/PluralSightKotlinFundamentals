package com.aggreyah

fun main(args: Array<String>){
    var h1: Header = Header("h1")
    var h2: Header = Header("h2")
    println("new header ${h1.add(h2).Name}")
}

class Header(var Name: String){

}

fun Header.add(other:Header) : Header{
    return Header(other.Name + this.Name)
}