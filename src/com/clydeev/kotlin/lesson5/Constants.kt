package com.clydeev.kotlin.lesson5

const val num = 5

fun main(args: Array<String>) {

}

object Constants {
    const val CONSTANT1 = "This is a constant"
}

val `var` = Constants.CONSTANT1

class MyClass {
    companion object Cop {
        const val CONSTANT2 = "This is a constant2"
    }
}

val var2 = MyClass.CONSTANT2