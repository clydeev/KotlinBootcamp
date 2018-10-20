package com.clydeev.kotlin.lesson5.Buildings

fun main(args: Array<String>) {
    val woodBuilding = Building(Wood())
    woodBuilding.build()
}

open class BaseBuildingMaterial(var numberNeeded:Int = 1)

class Wood:BaseBuildingMaterial(4)

class Brick:BaseBuildingMaterial(8)

class Building<T: BaseBuildingMaterial>(private val buildingMaterial: T) {
    var baseMaterialsNeeded: Int = 100
    private var actualMaterialsNeeded: Int = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println("Type of material: ${buildingMaterial::class.simpleName}")
        println("No. of materials needed: $actualMaterialsNeeded")
    }
}