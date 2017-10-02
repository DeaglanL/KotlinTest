import com.qa.Person
import com.qa.Questions

fun main(args: Array<String>) {
    println("Hello World!")

    val David = Person("David")

    println("This persons name is ${David.name}")

    David.display()

    System.out.println("Normal java stuff still works ")

    David.doLamdasWork(::printName)

    var q = Questions()

}


fun printName(name: String){
    println(name)
}

