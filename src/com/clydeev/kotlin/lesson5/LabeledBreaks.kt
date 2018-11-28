package com.clydeev.kotlin.lesson5

fun main(args: Array<String>) {
    loop@ for (i:Int in 1..100) {
        for (j:Int in 1..10) {
            println(j)
            if (i == 10) {
                break@loop
            }
        }
    }
}