package com.clydeev.kotlin.lesson5

import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.full.declaredMemberFunctions

class Plant {
    fun trim() {}
    fun fertilize() {}
}

annotation class ImAPlant

fun reflections() {
    val classObj:KClass<Plant> = Plant::class
    for (method:KFunction<*> in classObj.declaredMemberFunctions) {
        println(method.name)
    }
}

fun main(args: Array<String>) {
    reflections()
}