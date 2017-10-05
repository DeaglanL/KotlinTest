package com.qa

class Questions {
    var answer:String = ""
    val correctAnswer: String = "42"
    val question:String = "The answer to life, the universe and everything?"
    var message:String = ""

    fun printResult(){
        when (answer) {
            correctAnswer -> println("you were correct")
            else -> println("Not correct")
        }
    }
}