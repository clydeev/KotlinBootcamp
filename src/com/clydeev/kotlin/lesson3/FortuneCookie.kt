package com.clydeev.kotlin.lesson3

import java.util.*

fun main(args: Array<String>) {
    var fortune:String
//    for (i in 1..10) {
    repeat(10) {
        fortune = getFortuneCookie(getBirthday())
        println(fortune)

        if (fortune.contains("Take it easy and enjoy life!"))
            return
    }
//    }
}

fun getFortuneCookie(birthday: Int): String {
    val fortunes = listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends, because they are your greatest fortune.")
    val index = when (birthday) {
        in 1..7 -> 4
        28, 31 -> 2
        else -> birthday.rem(fortunes.size)
    }
    return fortunes[index]
}

fun getBirthday():Int {
    print("Enter your birthday: ")
    return Scanner(System.`in`).nextLine().toIntOrNull() ?: 1
}
