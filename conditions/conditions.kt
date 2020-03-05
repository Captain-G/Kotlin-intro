package conditions

fun main() {
    val x:Int = 3
    val y:Int = 5

//    if

    if(x < y){
        println("$x is less than $y")
    }


//    if .... else

    if(x > y){
        println("$x is greater than $y")
    }else{
        println("$x is less than $y")
    }



//    if ... elseif .... else

    if(x > y){
        println("$x is greater than $y")
    }else if(y >= 5){
        println("$y is greater or equal to 5")
    }else{
        println("Closing the program")
    }
//if statement as an expression  *new stuff not in php

    val results =  if(x == 3){
        println("$x is equal to 3")
    }else if(y >= 5){
        println("$y is greater or equal to 5")
    }else{
        println("Closing the program")
    }

    println(results)

//    when statement
//    when(){
//        state1 -> println("hello world")
//        state2 -> println("hello world")
//        state3 -> println("hello world")
//        state4 -> println("hello world")
//    }
    println("Enter your age : ")
    val myAge : String = readLine()!!  //ask user to enter age
//    val age:Int = 17
    var age_as_int:Int = myAge.toInt()
    when(age_as_int){
        12 -> println("Join class 6")
        13 -> println("Join class 7")
        14 -> println("Join class 8")
        15 -> println("Join form 1")
        16 -> println("Join form 2")
        17 -> println("Getting an id soon")
    }




//assignment: if age is odd or even
    println("Enter your age : ")
    var givenAge : String = readLine()!!  //ask user to enter age
    var givenAgeInt:Int = givenAge.toInt()
    when(givenAgeInt % 2 == 0){
       true -> println("$givenAgeInt is even")
      false -> println("$givenAgeInt is odd")
    }























}