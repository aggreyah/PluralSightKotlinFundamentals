package com.aggreyah

fun main(args: Array<String>){
    val kevin = Student("Kevin", "Jones", 1)
    print(kevin.id)
}

abstract class Person(private var firstName: String, private var secondName: String) {

    open fun getName(): String{
        return "$firstName $secondName"
    }

    abstract fun getAddress(): String
}

class Student(firstName: String, secondName: String,_id:Int): Person(firstName, secondName){
    val id: Int
    var tutor: String
    init {
        id = _id
        tutor = ""
    }
    constructor(firstName: String, secondName: String, _id: Int, tutor: String): this(firstName, secondName, _id){
        this.tutor = tutor
    }
    override fun getName(): String{return ""}
    override fun getAddress(): String {
        return ""
    }
}