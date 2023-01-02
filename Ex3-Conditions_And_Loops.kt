package com.example.tuwiq

fun main() {
    // ex1
    for(i in 1..100){
        if(i>70){
            println("IT'S OVER 70!!! $i")
            break
        }else{
            continue
        }
    }
    println("Ex1 results ^^")
    println()
    // ex2
    var temperature=35
    while(temperature>10){
       when(temperature){
           30-> println("It’s Hot")
           20-> println("It’s Comfy")
           10-> println("IT'S COLD!!!")
           else-> println(temperature)
       }
        temperature--
    }

    println("Ex2 results ^^")

}