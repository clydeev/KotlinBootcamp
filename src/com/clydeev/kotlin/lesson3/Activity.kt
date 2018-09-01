package com.clydeev.kotlin.lesson3

fun main(args: Array<String>) {
    val mood = readLine() ?: "Happy"
    val weather = readLine() ?: "Sunny"
    val temperature = try {
        readLine()?.toInt() ?: 24
    } catch (e: NumberFormatException) {
        24
    }
    println(whatShouldIDo(mood, weather, temperature))
}

fun whatShouldIDo(mood: String, weather: String = "Sunny", temperature: Int = 24): String {

    fun happyAndSunny() = mood.toLowerCase().contains("happy") && weather == "Sunny"
    fun sadAndCold() =  mood.toLowerCase().contains("sad") && weather == "rainy" && temperature == 0
    fun summer() = temperature > 35

    return when {
        happyAndSunny() -> "Go for a walk"
        sadAndCold() -> "stay in bed"
        summer() -> "go swimming"
        else -> "Stay home and read."
    }
}