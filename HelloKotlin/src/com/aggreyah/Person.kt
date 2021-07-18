package com.aggreyah

class Person(var Name: String) {
    fun display(){
        println("Displayed name ${Name}")
    }

    fun printWithLambda(myFunc: (s : String) -> Unit){
        myFunc(Name)
    }
}