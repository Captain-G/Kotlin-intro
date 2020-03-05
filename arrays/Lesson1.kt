package arrays

fun main(args: Array<String>) {




//array is a collection of similar data types either of int , strings etc .
// Arrays in kt is mutable in nature with fixed size which means we can perform
// both read and write operations on elements of array
//yo
//
//    u can declare an array explicitly or implicitly


//use the array function to create an array
//declaring an array implicitly
//val country: "kenya"   //array declaration implicit dec
val numbers = arrayOf(1,2,3,4,5,6,7,8)
val names = arrayOf("John", "Mary","Paul","Mike")


//declaring an array explicit
val county:String="Nai" //array declaration explicit dec
val nums = arrayOf<Int>(1,2,3,4,5,6,7,8)
val majina = arrayOf("Johnny", "Mary","Pauline","Mike","Dan","Ian")


//accessing array items

    println(numbers[0])
//    2. use get : takes the index number as an argument
    println(majina.get(2))


//    creating an array using factory functions
    val cars = intArrayOf(1,3,4,5)
    val isTrue = booleanArrayOf(true,false)

//    changing array values : use set () method

//    set () method takes two arguments : one is the index of the
//    value you want to change the other arg is the value to replace

    majina.set(1, "Konny")
    println(majina.get(1))

    val num_names : Int = majina.size
    println(num_names)

//    looping through an array
for (i in 0..num_names-1) {
    println(majina.get(i))
    println(majina[i])

}
    println(majina[1].length) //returns number of characters in a string
    val char:Int=majina[1].length

    for(i in 0..majina[1].length){
        if(char < 4){
            println("Hello World")
        }else if(char >= 4){
            println("$majina")
        }
    }





}
