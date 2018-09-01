package com.clydeev.kotlin.lesson4

class SimpleSpice {
    var name: String = "curry"
    var spiciness: String = "mild"

    val heat: Int
        get() {
            return if (spiciness == "mild")
                5
            else
                0
        }

}

fun main(args: Array<String>) {
    val spice = SimpleSpice()
    println("Spice name: ${spice.name} Spiceness: ${spice.spiciness} Heat: ${spice.heat}")
}