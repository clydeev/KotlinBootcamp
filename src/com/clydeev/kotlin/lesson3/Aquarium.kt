package com.clydeev.kotlin.lesson3

import java.util.concurrent.ThreadLocalRandom

fun main(args: Array<String>) {
    println("Welcome to KOTLIN programming!")

    feedTheFish()

//    println(canAddFish(10.0, listOf(3,3,3))) //---> false
//    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false)) //---> true
//    println(canAddFish(9.0, listOf(1,1,3), 3)) //---> false
//    println(canAddFish(10.0, listOf(), 7, true)) //---> true
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

    swim()
    swim(speed = "Slowly")

    println("Should I change water? ${shouldChangeWater(day)}")
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true):Boolean {
    val finalTankSize:Double = if (hasDecorations) tankSize * 0.80 else tankSize
    var sum = 0
    for (i in currentFish) {
        sum += i
    }
    return (sum + fishSize) <= finalTankSize
}

fun canAddFish2(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true):Boolean {
    val finalTankSize:Double = tankSize * if (hasDecorations)  0.8 else 1.0
    val sum = currentFish.sum()
    return (sum + fishSize) <= finalTankSize
}

// Commented some choices to test else statement
fun fishFood(day: String): String {
    return when(day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
//      "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 30): Boolean {
    val isTooHot = temperature > 30
    val isDirty = dirty > 30
    val isSunday = day == "Sunday"

    return when {
        isTooHot -> true
        isDirty -> true
        isSunday -> true
        else -> false
    }
}

fun swim(speed: String = "fast") {
    println("Swimming $speed")
}

fun randomDay(): String {
    val days = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return days[ThreadLocalRandom.current().nextInt(0, 7)]
}