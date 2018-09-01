package com.clydeev.kotlin.lesson3

import java.util.concurrent.ThreadLocalRandom

fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    println(spices.filter { it.contains("curry") }.sortedBy { it.length })
    println(spices.filter { it.startsWith('c') && it.endsWith('e') })
    println(spices.take(3).filter { it.startsWith('c') })

    val rollDice = {sides: Int ->
        if (sides == 0)
            0
        else
            ThreadLocalRandom.current().nextInt(1, sides)
    }

    val rollDice2: (Int) -> Int = {sides ->
        if (sides == 0)
            0
        else
            ThreadLocalRandom.current().nextInt(1, sides)
    }

    fun gameplay(f: Int) = println(f)
    gameplay(rollDice2(6))
}
