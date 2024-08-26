package com.example.thesocialnetwork.exmaples


    data class Phone(
    val size: Float,
    val weight: Float,
    val numbersOfCameras: Int,
    val brand: String,
    val color: String,
    val model: String,
    var battery: Int,
    var signalStrenght: Int,

    ) {

        fun call(Phone: String) {
            println("The phone $brand - $model is calling the number $Phone")
        }

        override fun toString(): String {
            return "brand:$brand\nmodel : $model\ncolor: $color\n------------------------\n"
        }
    }

data class Tablet(
val size: Float,
val weight: Float,
val numbersOfCameras: Int,
val brand: String,
val color: String,
val model: String,
var battery: Int,
var signalStrenght: Int,
) {
    override fun toString(): String {
        return "\nbrand:$brand\nmodel : $model\ncolor: $color\n------------------------\n"
    }


}


    fun main65() {
        val iphone14 = Phone(
            140f,
            60f,
            3,
            "Apple",
            "purple",
            "Iphone 14 Pro Max",
            100,
            90,
        )
        iphone14.call("333-333-333")
        iphone14.call("555-555-555")

        println(iphone14.color)

        val samsung24 = Phone(
            140f,
            50f,
            4,
            "Samsung",
            "orange",
            "Samsung s24 Pro Max",
            99,
            95,

            )
        val Ipad = Tablet(
            180f,
            70f,
            2,
            "Iphone",
            "pink",
            "Ipad Pro Max",
            88,
            92,
        )
        println(Ipad)

        println(iphone14.toString())
        println(samsung24.toString())





    }




















