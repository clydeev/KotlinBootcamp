package com.clydeev.kotlin.lesson4

class Spice(val name: String, val spiceness: String = "mild") {
    val heat:Int
        get() = when(spiceness) {
            "mild" -> 5
            "hot" -> 7
            "superhot" -> 10
            else -> 1
        }

    init {
        print("Spice created -> name: $name spiceness: $spiceness heat: $heat\n")
    }

    fun makeSalt():Spice = Spice("salt", "none")

    override fun toString(): String {
        return name
    }
}

fun main(args: Array<String>) {
    val spices = listOf(Spice("curry"),
            Spice("california pepper", "superhot"),
            Spice("dragon's breath", "superhot"),
            Spice("sili", "hot"))

    println(spices)
    println(spices.filter { it.heat == 10 })
    println()
}