package com.clydeev.kotlin.lesson5

fun main(args: Array<String>) {
    val list:List<Int> = listOf(1, 2, 3, 4, 5)
    println(list)
    println(reverseList(list))
    println(reverseList2(list))
    println(list.reversed())

    val symptoms:MutableList<String> = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")
    symptoms.add("white fungus")
    symptoms.remove("white fungus")
    println(symptoms.subList(4, symptoms.size))

    val cures:Map<String, String> = mapOf("white spots" to "Ich", "red sores" to "hole disease")
    println(cures.get("white spots"))
    println(cures["white spots"])
    println(cures.getOrDefault("bloating", "sorry I don't know"))

    val allBooks:Set<String> = setOf("Hamlet", "Macbeth", "Romeo and Juliet", "Othello", "King Lear")
    val library:Map<String, Set<String>> = mapOf("William Shakespeare" to allBooks)
    println(library.any { it.value.contains("Hamlet") })
    val moreBooks:MutableMap<String, Set<String>> = mutableMapOf("William Shakespeare" to allBooks)
    println(moreBooks.getOrPut("William Shakespeare") { allBooks })
    println(moreBooks.getOrPut("Victor Hugo") { setOf("Les Miserables")})
    println(moreBooks)
}

fun reverseList(list: List<Int>): List<Int> {
    val result:MutableList<Int> = mutableListOf()
    for (i:Int in 0 until list.size) {
        result.add(list[list.size - i - 1])
    }
    return result
}

fun reverseList2(list: List<Int>): List<Int> {
    val result:MutableList<Int> = mutableListOf()
    for (i:Int in list.size - 1 downTo 0) {
        result.add(list[i])
    }
    return result
}