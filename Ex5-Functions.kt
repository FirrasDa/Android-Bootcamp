package com.example.tuwiq

fun main() {
    operation(3.4,5.2,"*")
}
fun operation(n1:Double ,n2:Double , op:String ="+"){
    when(op){
        "+"-> println(n1+n2)
        "-"-> println(n1-n2)
        "*"-> println(n1*n2)
        "/"-> println(n1/n2)

    }
}
