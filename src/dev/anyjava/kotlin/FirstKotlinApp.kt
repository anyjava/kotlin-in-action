package dev.anyjava.kotlin

data class Person(var name: String, var age: Int? = null)

operator fun Person.plus(p : Person) : Person {
    return Person("plus operator", this.age!! + p.age!!)
}

operator fun Person.plusAssign(p : Person) : Unit {
    this.name = "plusAssign"
    this.age = this.age?.plus(p.age!!)
}

fun main(args: Array<String>) {
    val persons = listOf(Person("영희"), Person("철수", age = 29))
    val oldest = persons.maxBy{ it.age ?: 0}
    println("oldest: $oldest")

    // plus & plusAssign operator override
    val p1 = Person("A", 1)
    val p2 = Person("B", 2)

    p1 += p2
    println(p1)
}

