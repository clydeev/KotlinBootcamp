package com.clydeev.kotlin.lesson5

const val MAX = 5

class Book(val title: String, val author: String, val year: Int = 0) {
    fun pair(): Pair<String, String> {
        return title to author
    }

    fun triple(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(num: Int):Boolean {
        return num < MAX
    }

    fun printUrl() {
        println("$BASE_URL/$title.html")
    }

    companion object Constants {
        const val BASE_URL = "http://google.com/"
    }
}

fun main(args: Array<String>) {
    val book = Book("Holub on patterns", "Allen Holub", 2004)
    val (title, author) = book.pair()
    val (title2, author2, year2) = book.triple()
    println("Here is your book $title written by $author")
    println("Here is your book $title2 written by $author2 in year $year2")
}
