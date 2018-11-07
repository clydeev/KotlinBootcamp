package com.clydeev.kotlin.lesson5.buildings

fun main(args: Array<String>) {
    val woodBuilding = Building(Wood())
    woodBuilding.build()
    isSmallBuilding(woodBuilding)
    isSmallBuilding(Building(Brick()))
}

open class BaseBuildingMaterial(var numberNeeded:Int = 1)

class Wood:BaseBuildingMaterial(4)

class Brick:BaseBuildingMaterial(8)

class Building<out T: BaseBuildingMaterial>(private val buildingMaterial: T) {
    var baseMaterialsNeeded: Int = 100
    val actualMaterialsNeeded: Int = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println("Type of material: ${buildingMaterial::class.simpleName}")
        println("No. of materials needed: $actualMaterialsNeeded")
    }
}

fun <T: BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500)
        println("Small building")
    else
        println("Large building")
}