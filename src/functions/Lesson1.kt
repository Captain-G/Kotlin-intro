package functions
//A parameter is a variable in a method definition.
// When a method is called, the arguments are the data
// you pass into the method's parameters. Parameter is
// variable in the declaration of function. Argument is
// the actual value of this variable that gets passed to
// function.

//a block of code that has a specific task e.g println()
//fun nameof function(){
//    code to execute
//}
fun greetings1(){
    println("hello world")
}
//functions that take an argument
//parameter ;is avariable passed into a function during function creation
fun greetings2 (name:String){
    println("hello $name")
}
fun greetings3 (name:String,age:Int){
    println("Hi am  $name , am $age years old")
}
fun main(args: Array<String>) {
//    to call a function use greetings1()
//    MUST be in the main function
    greetings1()
    println("hello once again")
    greetings2("john")//john as an argument
    greetings3("john",23)//john and 23 are argument


}