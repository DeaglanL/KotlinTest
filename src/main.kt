import com.qa.Person

fun main(args: Array<String>) {
        println("Hello World!")

     val David = Person("David")

    println("This persons name is ${David.name}")

    David.display()

    System.out.println("Normal java stuff still works ")

    David.doLamdasWork(::printName);

}


fun printName(name: String){
    println(name)
}

