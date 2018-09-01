package com.clydeev.kotlin.lesson4.spice

data class SpiceContainer(var spice: Spice){
    val label = spice.name
}

fun main(args: Array<String>) {
    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
            SpiceContainer(Curry("Red Curry", "medium")),
            SpiceContainer(Curry("Green Curry", "super spice")))

    for (el in spiceCabinet) {
        println(el.label)
    }
}