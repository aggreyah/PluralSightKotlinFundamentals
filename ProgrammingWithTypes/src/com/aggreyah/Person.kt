package com.aggreyah

fun main(args: Array<String>){
    val kevin = Student("Kevin", "Jones", 1)
    print(kevin.id)

    Student.createUndergrad("Simon")
    Student.createPostgrad("Kevin")
}

class Program{
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            val kevin = Student("Kevin", "Jones", 1)
            print(kevin.id)

            Student.createUndergrad("Simon")
            Student.createPostgrad("Kevin")
        }
    }
}

abstract class Person(private var firstName: String, private var secondName: String) {

    open fun getName(): String{
        return "$firstName $secondName"
    }

    abstract fun getAddress(): String
}

open class Student(firstName: String, secondName: String, _id:Int): Person(firstName, secondName){
    val id: Int
    var tutor: String
    init {
        id = _id
        tutor = ""
    }
    constructor(firstName: String, secondName: String, _id: Int, tutor: String): this(firstName, secondName, _id){
        this.tutor = tutor
    }

    fun enrole(courseName: String){
        val course = Courses.allCourses.filter { it.Title == courseName}.firstOrNull()
    }
    override fun getName(): String{return ""}
    override fun getAddress(): String {
        return ""
    }

    companion object: XmlSerializer<Student> {
        fun createUndergrad(name: String) : Undergraduate{return Undergraduate(name)
        }
        fun createPostgrad(name: String): Postgraduate{return Postgraduate(name)}
        override fun toXml(item: Student) {
            TODO("Not yet implemented")
        }
    }
}

class Undergraduate(firstName: String): Student(firstName, "", 1){}
class Postgraduate(firstName: String): Student(firstName, "", 1){}
interface XmlSerializer<T> {fun toXml(item: T)}