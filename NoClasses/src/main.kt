import java.lang.NumberFormatException

fun main(args: Array<String>){
    var numbers = listOf<Int>(1,2,3,4,5)
    for (i in numbers) {
        print("$i ")
    }
    println("")
    var ages = HashMap<String, Int>()
    ages.put("Kevin", 55)
    ages.put("Stanely", 59)
    ages.put("David", 38)

    for ((name, age) in ages){
        println("$name is $age")
    }

    for ((index, element) in numbers.withIndex()){
        println("$element is at index $index")
    }
}

class Question{
    var Answer: String = ""
    val CorrectAnswer = "42"
    val Question: String = "What is the answer to life, the universe and everything?"

    fun display(){
        println("The answer is $Answer")
    }

    fun printResult(){
        when (Answer) {
            CorrectAnswer -> {
                println("You were correct.")
            }
            else -> {
                println("Try again.")
            }
        }
    }
}