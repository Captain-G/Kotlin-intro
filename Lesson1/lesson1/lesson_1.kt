package Lesson1.lesson1

//kotlin code gets executed or run only in the main()
//main()defines where kotlin code gets executed
//the {} defines the scope of your executable code
fun main() {
//    println() : prints content with a new line at the end
//    print() : prints content with a continuous line
    println("Hello World")
    println("Peter Gachuki")
    print("For print they all appear in one line")
//Explicitly defining the type of variables
    println()
    val country:String = "Kenya" // constant
    var county:String ="Machakos"
    var age : Int = 23
    println(age)

    county = "Nairobi"
    println(country)
    println(county)


//    implicitly defining the type of variables

    val name = "John Doe"
    val language = "Kotlin"
    println(name)
    println(language)

//kotlin datatypes
//1. Numbers
//    1.1 Integers : non decimal numbers
    var my_age:Int = 23
    println(my_age)
    my_age = my_age + 10
    println(my_age)
//    1.2 Floats : numbers with decimal points
    val height = 3.56F
    println(height)



//2. Boolean
//    true or false
    val isloggedin : Boolean = true
    val isloggedout : Boolean = false



//3. Strings already seen up there

    var length : Int = 25
    var ruler:String = "Oxford"
    println("The length of the "+ ruler +" ruler is " +length+ " cm")
    println("The length of the  $ruler ruler is $length cm")



//4. Characters declared using single quotes
    val first_letter = 'J'

//    assignment : create two variables num_1 and num_2 storing 10 and 20 respectively and calculate the sum
//    of the two numbers
    val num_1:Int = 10
    val num_2:Int = 20
    val sum:Int = num_1 + num_2
    println(sum)
    var gender : String
    gender = "Male"
    println(gender)



//5. Arrays


    








//    assignment : research on two methods that apply to kotlin strings


}
