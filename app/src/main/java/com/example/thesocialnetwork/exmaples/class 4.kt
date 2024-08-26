package com.example.thesocialnetwork.exmaples

fun main44() {
    println("Welcome to Sandwiches and Milkshakes")
    println("Do u want a Milkshake?")
    var answer = readLine()
    if (answer == "Yes") {
        println("What flavour")

        val fruit = String
        println(fruit)

        val flavour = readLine()
        milkshake(flavour!!)
    }


        println("Do u want a Sandwich?")
        answer = readLine()
        if (answer == "Yes") {
            println("what protein of sandwich")
            println("This sandwich is more expensive, Do u want to confirm")
            val confirmation = readLine()
            if (confirmation == "Yes") {
                val protein = readLine()
                sandwich(protein!!)
            }
        } else {

        }

        println("Thank u for Visiting")

    }


    fun milkshake(fruit: String) {
        println("Starting a milkshake")
        println("The Milkshake of $fruit is done")
        println("---------------------")


    }

    fun sandwich(protein: String) {
        println("Starting a sandwich")
        println("The sandiwch of $protein is done")
        println("---------------------")

    }


