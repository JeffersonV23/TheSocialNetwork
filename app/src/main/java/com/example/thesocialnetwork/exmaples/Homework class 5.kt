package com.example.thesocialnetwork.exmaples

data class Computer(
    val size: Float,
    val weight: Float,
    val color: String,
    val brand: String,
    val model: String,

    var mouse: Int,
    var keyboard: Int,
    var screen: Int,
    var fans: Int,

) {
    fun run(computer: String) {
        println("The Computer $brand - $model is connecting to the $computer ")
    }

    override fun toString(): String {
        return "brand: $brand\n model : $model\n color :\n $color\n -------------------------"

    }
}
    fun main20() {
        val Pcgamer = Computer(
            89f,
            200f,
            "Red",
            "Nitro 5",
            "AN5-555 Pro",
            1,
            1,
            1,
            4,
        )
        println(Pcgamer.toString())
        Pcgamer.run("External Screen ")
    }









