package com.clydeev.kotlin.lesson5

open class WaterSupply(var needsProcessed: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessed = false
    }

    override fun toString(): String {
        return "tap water"
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessed = false
    }

    override fun toString(): String {
        return "lake water"
    }
}

class Aquarium<out T: WaterSupply>(val waterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        if(!waterSupply.needsProcessed) {
            cleaner.clean(waterSupply)
        }
        println("Adding water from $waterSupply")
    }
}

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner: Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) {
        waterSupply.addChemicalCleaners()
    }
}

fun genericExample() {
    val aquarium = Aquarium(TapWater())
    aquarium.waterSupply.addChemicalCleaners()
    aquarium.addWater(TapWaterCleaner())
    addItemTo(aquarium)
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("Item added")

fun main(args: Array<String>) {
    genericExample()
}