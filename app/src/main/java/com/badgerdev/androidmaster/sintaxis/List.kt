package com.badgerdev.androidmaster.sintaxis

fun main () {
//    immutableList()
    mutableList()
}

fun mutableList() {
    val weekDays:MutableList<String> = mutableListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    weekDays.add(0, "BadgerDay")
    println(weekDays)
}

fun immutableList() {
    val readOnly:List<String> = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

//    println(readOnly.size)
//    println(readOnly)
//    println(readOnly.last())
//    println(readOnly.first())
//
//    val example = readOnly.filter { it.contains( "i" ) }
//    println(example)

    readOnly.forEach { weekDay -> println(weekDay) }
}