fun main(){
    val a = 5
    val result = Factorial(5)
    println(result)

}



fun Factorial(a : Int):Int{
    val result :Int
    if(a<=1){
        result = a
    }
    else
    {
        result = a*Factorial(a-1)
    }
    return result
}