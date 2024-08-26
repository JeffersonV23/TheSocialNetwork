package com.example.thesocialnetwork.exmaples

enum class Brand {
    Buggati,
    Mercedez,
    Bmw,
    Ferrari,
    Mazda,
    Paganni,
    Unkown,

}

enum class Engine {
    One,
    Two,
    Three,
    Four,
    Five,
    Six,

}
 enum class Color {
    Red,
    White,
    Black,
    Purple,
    Pink,
    Orange,
    Yellow,
    Cion,
    Blue,
    Green,
    Uknown,

}
open class Car(
    var brand: Brand = Brand.Unkown,
    open val height: Float= 0F,
    open val width: Float=100F,
    var model: String = "",
    var color: Color = Color.Purple,

    )
{
    override fun toString(): String {
        return "Brand: $brand, Height: $height,:Model:$model,Color:$color"

    }
}
data class AutoCar (
    val numberOfengine : Int,
    val typeOfengine: Int,
    override var width: Float = 0F,
    override var height: Float,

) : Car(width = width, height = height) {

    override fun toString(): String {
        return super.toString() + ",Number of Engine: $numberOfengine, Type of Engine: $typeOfengine"

    }

    fun describe(): String {
        return "Brand: $brand, Number of Engine: $numberOfengine"
    }
}

fun main(){
    val Car = AutoCar (
        width = 100F,
        height = 200F ,
        numberOfengine =1,
        typeOfengine=1,
    )
val buggatti = AutoCar(numberOfengine =1,typeOfengine =2, height= 200f)
    buggatti.brand= Brand.Buggati
    buggatti.model ="Buggati Ponifest"
    buggatti.color = Color.Red
    buggatti.width = 100F

    println(buggatti)
    println(Car)
}






















/**
 * Create a parent class with both constant and variable properties and two level classes, the last
 *  * one has to be a data class
 *  *
 *  * 1.that means 3 hierarchy levels.
 *  * 2.Use override
 * 3. Use data class in the last level
 * 4. Create custom objects of each level
 * 5. (Optional) Use of arrays and enum classes
 **/