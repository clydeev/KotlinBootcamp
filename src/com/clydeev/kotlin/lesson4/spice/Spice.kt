package com.clydeev.kotlin.lesson4.spice

abstract class Spice(val name: String, val spiceness: String = "mild", color: SpiceColor = YellowSpiceColor): SpiceColor by color {
    open val heat:Int
        get() = when(spiceness) {
            "mild" -> 5
            "hot" -> 7
            "superhot" -> 10
            else -> 1
        }

    init {
        print("Spice created -> name: $name spiceness: $spiceness heat: $heat\n")
    }

    override fun toString(): String {
        return name
    }
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor: SpiceColor {
    override val color: Color = Color.YELLOW
    override fun toString(): String {
        return color.toString()
    }
}

interface Grinder {
    fun grind()
}

class Curry(name: String, spiceLevel: String): Spice(name, spiceLevel, YellowSpiceColor), Grinder {
    override fun grind() {

    }
}

fun main(args: Array<String>) {
    println(Curry("Yellow Curry", "mild").color)
}