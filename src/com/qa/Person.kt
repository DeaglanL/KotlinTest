package com.qa

class Person(var name: String) {


    fun display(){
        println("Displaying name : ${name}")
    }

    fun doLamdasWork(func: (s:String) -> Unit){
        func(name)
    }
}
