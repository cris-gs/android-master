package com.badgerdev.androidmaster.sintaxis

fun main() {
    val weekDays = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    for (index in weekDays.indices){
        println(weekDays[index])
    }

    for ((index, value) in weekDays.withIndex()) {
        println("Index $index, contains $value")
    }

    for (weekDay in weekDays){
        println("Now is $weekDay")
    }
}