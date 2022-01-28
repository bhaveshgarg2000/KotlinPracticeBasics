fun main(){
 val fruits = arrayOf<String>("Banana","Apple","Pineapple","Kiwi","Orange","Mango","Mango","Apple")
    println(fruits[2])
    println(fruits[0])
    println(fruits[5])

    println("Size of Array : "+fruits.size)
// loop python

//    for(items in fruits)
//        println(items)

//
//        if("Mango" in fruits) {
//            println("Mango Exists in Fruits")
//        }else{
//            println("Not Exists")
//        }

    val distinct = fruits.distinct()
    for (items in distinct)
        println(items)

println("Array is Enmpty : " + fruits.isEmpty())

}
