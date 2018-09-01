package com.clydeev.kotlin.lesson4

fun main(args: Array<String>) {
    makeDecorations()
}

fun makeDecorations() {
    val decor = Decorations(rocks = "granite")
    println(decor)

    val decor2 = Decorations("slate")
    println(decor2)

    val decor3 = Decorations(rocks = "slate")
    println(decor3)

    println(decor == decor2)
    println(decor2 == decor3)

    val decor4 = decor3.copy()
    println(decor4)

    val decor5 = Decorations2(rocks = "crystal", wood = "wood", diver = "diver")

    val (rock: String, wood: String, diver: String) = decor5;
    println(rock)
    println(wood)
    println(diver)
}

data class Decorations(var rocks: String)

data class Decorations2(var rocks: String, var wood: String, var diver: String)
