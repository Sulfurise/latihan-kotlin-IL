package Kotlin_Function

fun main(){
    println(factorial(199))
}

tailrec fun factorial(n:Int,result: Int =1):Int{
    val newResult = n * result
    return if (n == 1){
        newResult
    }else{
        factorial(n-1, newResult)
    }
}