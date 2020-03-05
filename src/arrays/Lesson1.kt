package arrays

fun main(args: Array<String>) {
    //array is a collection of similar datatypes either
//int string array in kotlin is  mutable in nature with fixed size
//which means can perform both read and write operations on elements
//of array you can declare an array explicity and implicity use the array
//function to crteate the array

//declaring an array implicity
    val country ="kenya" //array dec implicit
    val numbers = arrayOf(1,2,3,4,5,6,7,8)
    val names  = arrayOf("john","mary","paul","mike")

//declaring an arry implicity
    val county:String = "Nai" //implicit dec
    val  nums = arrayOf<Int>(1,2,3,4,5,6,7,8)
    val  majina = arrayOf<String>("john","mary","paul","mike")

//accesing  array items
//use index numbers
    println(numbers[0])
//    2.use get()takes index number as an argument
    println(majina.get(2))
//creating an array using  factory  functions
     val cars = intArrayOf(1,3,5,7,9,5)
    val isTrue = booleanArrayOf(true,false)
//    changing values use  set() method
//    set()method takes two arguments one is the index of the value
//    you want to change the other arg is the value of
//    replace with
    majina.set(1,"kony")
    println(majina.get(1))

    val num_names:Int = majina.size
    println(num_names)
//    looping through an array
    for(i in 0..num_names-1){
        println(majina.get(i))
        println(majina[i])
    }
    //getting lenght of characters in a string
println(majina[1].length)//lenght function returns numberof characters
    //in a string





}
