package com.example.thesocialnetwork.exmaples

import Brand
import Color


data class electronicDevice(
    var brand: Brand = Brand.Unknown,
    var model : String = "",
    val width: Float,
    val height : Float,
    var color: Color = Color.Black,
)
fun main900(){
    val iphone = electronicDevice (width = 120F,height =98F)
    iphone.brand = Brand.Apple
    iphone.model = "Iphone 14 Pro Max"
    iphone.color = Color.White
    println(iphone.toString())

    val iphone2= iphone.copy(color=Color.Red)
    println(iphone2)
}

/**
 * Create a parent class with both constant and variable properties and two level classes, the last
 * one has to be a data class
 *
 * 1.that means 3 hierarchy levels.
 * 2.Use override
 * 3. Use data class in the last level
 * 4. Create custom objects of each level
 * 5. (Optional) Use of arrays and enum classes
 */