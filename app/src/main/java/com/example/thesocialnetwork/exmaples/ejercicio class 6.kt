package com.example.thesocialnetwork.exmaples

enum class namePet {
    Kyra,
    Ronald,
    Mateo,
    Estrella,
    Luna,

}
enum class agePet {
    One,
    Two,
    Three,
    Four,
    Five,
    Six,
    Seven,
    Eight,
    Nine,
    Ten,
    Eleven,
    Twelve,
    Thirteen,
}
enum class typePet{
    Dog,
    Cat,
    Duck,
    Shark,
    Snake,
    Monkey,
    Wolf,
    Tiger,
    Pigeon,
    Parrot,
    Sheep,
    Cow,
}
enum class humanName{
    Jefferson,
    Brayan,
    Camilo,
    Sofia,
    Laura,
    Valentina,
    Monica,
    Luis,
    Luisa

}
enum class skinColor{
    White,
    Black,
    Brown,
    Ginger,
    Blond,
}
    enum class bodyHuman {
        Tall,
        Thin,
        Thick,
        Fat,
        Skinny,

}
data class Pet(
    val name: namePet,
    val age : agePet,
    val type: typePet,
    val namePet:ArrayList<namePet>

)
data class human(
    val humanname : humanName,
    val skincolor : skinColor,
    val bodyHuman : bodyHuman,
    val humanbody: ArrayList<humanName>


)
fun main66() {
    val pet = Pet(
        namePet.Kyra,
        agePet.Six,
        typePet.Dog,
        arrayListOf(
            namePet.Kyra,


            )
    )
    val human= human(
        humanName.Luis,
        skinColor.Brown,
        bodyHuman.Fat,
        arrayListOf(
            humanName.Luis
        )

    )

    println(human)
    println(pet)
}







/**
 * 2 Object of class Human(Properties), array of pets, pet (Type, name, age)
 *
 */

