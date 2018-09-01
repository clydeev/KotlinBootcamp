package com.clydeev.kotlin.lesson3

import java.util.*


fun main(args: Array<String>) {
        println("Welcome to KOTLIN programming language!")

        dayOfWeek()

        println("${if (args[0].toInt() < 10) "Good Morning" else "Good Night"}, Kotlin")


//        val nullCheck:Int? = null
//        val nullCheck2 = 0
//
//        println(nullCheck?.inc() ?: 0)
//        println(nullCheck2.inc())
//
//        nullCheck = 10
//        nullCheck2 = 1_000_000
//
//        println("${nullCheck * nullCheck2}")
//
//        val fishName = "Bga4"
//        val result:Any = when (fishName.length) {
//            0 -> "Error"
//            in 3..12 -> "Good fish name"
//            else -> 1
//        }
//
//        val helloWorld = false
//
//        println(result)
//        println(helloWorld)
//
//        val array = arrayOf("orange", "apple", "grapes")
//        for ((i, `val`) in array.withIndex()) {
//            println("$i $`val`")
//        }
//
//        val array2 = Array(7) {1000.0.pow(it)}
//
//        for (v in array2) {
//            println(v)
//        }
//
//        val numbers = arrayOf(11, 12, 13, 14, 15)
//        val empty = mutableListOf<String>()
//
//        for((i, value) in numbers.withIndex()) {
//            empty.add(value.toString())
//        }
//
//        for (value in empty) {
//            println(value)
//        }

    }

    private fun dayOfWeek() {
        println("What day is it today?")
        val dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
        when(dayOfWeek) {
            1 -> println("Sunday")
            2 -> println("Monday")
            3 -> println("Tuesday")
            4 -> println("Wednesday")
            5 -> println("Thursday")
            6 -> println("Friday")
            7 -> println("Saturday")
        }
    }
