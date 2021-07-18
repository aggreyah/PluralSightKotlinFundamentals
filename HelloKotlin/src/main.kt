import com.aggreyah.Person

fun main(args: Array<String>){
    println("Hello, Kotlin World!")
    var kevin = Person("Kevin")
    println("My name is ${kevin.Name}")
    kevin.display()
    kevin.printWithLambda (::printName)
}
fun printName(s: String){
    println("printName: $s")
}