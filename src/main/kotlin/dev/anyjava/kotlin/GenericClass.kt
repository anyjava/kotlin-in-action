package dev.anyjava.kotlin

fun printContents(list: List<Any>) {
    println(list.joinToString())
}

fun addAnswer(list: MutableList<Any>) {
    list.add(43)
}

fun main(args: Array<String>) {
    printContents(listOf("123", "abc"))

    val strings = mutableListOf("1", "2")
//    addAnswer(strings) -> compile error
    println(strings.maxBy { it.length })
}
