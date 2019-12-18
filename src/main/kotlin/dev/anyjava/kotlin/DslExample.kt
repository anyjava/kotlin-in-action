package dev.anyjava.kotlin

fun buildString (
    builderAction: (StringBuilder) -> Unit
) : String {
    val sb = StringBuilder()
    builderAction(sb)
    return sb.toString()
}

fun main(args: Array<String>) {
    val s = buildString {
        it.append("hello, ")
        it.append("world!")
    }
    println(s)
}

