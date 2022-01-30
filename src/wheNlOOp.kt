fun main(args: Array<String>){
   var Animal  : String = "Dog"
    var result = when(Animal){
        "Horse" -> println("Horse")
        "Cat" -> println("Cat")
        "Dog" -> println("Dog")
        "Cow" -> println("Cow")
        else -> println("NOt Found")

    }
}