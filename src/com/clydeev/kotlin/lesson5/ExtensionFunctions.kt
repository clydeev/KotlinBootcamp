package com.clydeev.kotlin.lesson5

fun String.hasSpaces() = this.find { it == ' ' } != null

fun main(args: Array<String>) {
    println("Doesithavespaces?".hasSpaces())

    val plant = GreenLeafyPlant(size = 50)
    plant.print()

    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()
    println(aquariumPlant.isGreen)
}

open class AquariumPlant(val color: String, private val size: Int)
class GreenLeafyPlant(size: Int): AquariumPlant("Green", size)

fun AquariumPlant.isRed() = color == "Red"
fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

val AquariumPlant.isGreen: Boolean
    get() = color == "Green"