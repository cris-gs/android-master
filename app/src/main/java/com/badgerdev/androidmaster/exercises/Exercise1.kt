package com.badgerdev.androidmaster.exercises

/*
Typically, your phone provides you with a summary of notifications.

In the initial code provided in the following code snippet,
write a program that prints the summary message based on the number of notifications
that you received.

The message should include:

The exact number of notifications when there are less than 100 notifications.
99+ as the number of notifications when there are 100 notifications or more.

Result:

You have 51 notifications.
Your phone is blowing up! You have 99+ notifications.
*/

fun main() {
    val morningNotifications = 51
    val eveningNotifications = 135

    printNotificationSumary(morningNotifications)
    printNotificationSumary(eveningNotifications)
}

fun printNotificationSumary (numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("You have $numberOfMessages notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}