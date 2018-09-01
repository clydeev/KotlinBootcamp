package com.clydeev.kotlin.lesson4

abstract class AquariumFish: FishAction {
    abstract val color: String
}

class Shark: AquariumFish() {
    override fun eat() {
        println("hunt and eat fish")
    }

    override val color: String = "Gray"
}

class Plecostumos: AquariumFish() {
    override fun eat() {
        println("munch on algae")
    }

    override val color: String = "Gold"
}

interface FishAction {
    fun eat()
}

interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim() {
        println("Swim")
    }
}

fun main(args: Array<String>) {
    makeFish()

}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostumos()

    println("Shark: ${shark.color}\nPleco: ${pleco.color}")

    shark.eat()
    pleco.eat()

    feedFish(shark)
    feedFish(pleco)
}

fun feedFish(action: FishAction) {
    action.eat()
}