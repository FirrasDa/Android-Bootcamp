package com.example.tuwiq

fun main() {
    var a= arrayListOf<Double>()
    var j:Double =0.0
    for(i in 0 until 5){
        when(i){
            0-> a.add(1.1)
            1-> a.add(3.4)
            2-> a.add(5.6)
            3-> a.add(7.2)
            4-> a.add(9.3)
        }
        j+=a[i]
    }
    println(j/a.size)


}