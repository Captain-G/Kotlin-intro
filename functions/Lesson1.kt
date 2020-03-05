package functions

//a block of code that has a specific task
//eg println()

//fun nameOfFunction(){
//    code to execute
//}

fun greetings1(){
    println("Hello World")
}
fun greetings2(name:String){
    println("Hello $name")
}
fun greetings3(name:String,age:Int){
    println("Hi I am $name , am $age years old")
}
//fun sum(num1:Int,num2:Int){
//    ans:Int = num1 + num2
//    println("")
//
//}
fun evenodd(num:Int){
    println("Enter a number here : ")
    if(num % 2 == 0){
        println("$num is even")
    }else{
        println("$num is odd")
    }
}


fun main(args: Array<String>) {
//    to call a function use greetings1()
//        must be in the main function
    greetings1()
    println("hello once again")

//    fun thisone(parameter){  when introducing a function
//
//    }
//    thisone(arguement) when calling is an argument
//


}
