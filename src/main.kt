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

    println(q.question);

    q.answer = "42"

    println(q.answer)

    q.message = if(q.answer == q.correctAnswer) {
        "you were correct"
    }
    else
        "Not correct"


    println(q.message)

    //Kotlin has no switch statment but uses when instead
    q.printResult()


    //LOOPS
    for (i in 1..10)
    {
        println(i)
    }

    for (i in 1..10 step  2)
    {
        println(i)
    }

    for (i in 1 until 10)
    {
        println(i)
    }

    


}


fun printName(name: String){
    println(name)
}

