
enum class Brand {
    Samsung,
    huaweii,
    Apple,
    Lg,
    Lenovo,
    Acer,
    Unknown,

}
enum class Color {
    Red,
    Black,
    White,
    Orange,
    Pink,
    Green,
    Gray,

}



data class ElectronicDevice(
    val brand: Brand,
    val model: String,
    val weight: Float,
    val height: Float,
    val color: Color,
)


fun main99(){
    val tv = ElectronicDevice (
        brand = Brand.Samsung,
        model = "HD4k",
        weight = 190f,
        height = 99f,
        color = Color.White,
    )
    val iphone = ElectronicDevice (
        brand = Brand.Apple,
        model = "Iphone 15 Pro Max",
        weight = 90f,
        height = 90f,
        color = Color.Pink,
    )
    val ipad = ElectronicDevice (
        brand = Brand.Apple,
        model = "Ipad 2Pro Max",
        weight = 96f,
        height = 95f,
        color = Color.Red,
    )


        println (tv)
        println(iphone)
        println(ipad)

    if (tv.brand == iphone.brand) {
        println("Device model) ${tv.model} and ${iphone.model} are not the same brand")

    }

    if (iphone.brand == ipad.brand){
        println("Device model) ${iphone.model} and ${ipad.model} are the same brand")
    }

    }

