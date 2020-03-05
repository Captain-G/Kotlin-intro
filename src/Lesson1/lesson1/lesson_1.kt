package Lesson1.lesson1
//kotlin code gets executed /run only when its inside the main function
//main()defines where code is executed
//the{}defines the scope of the executable code
fun main() {
//  println()prints content with anew line at the end
//  print()prints content with a continous line
  println("helloworld")
  println("yourname")
  print("helloworld")
  print("helloworld")
  print("helloworld")
  println()
//  explicity defining the type of variable

  val country:String = "Kenya"//CONSTANT
  var county:String ="Machakos"
  var age:Int =23
  var gender :String
  gender ="Male"
  println(gender)

  county = "UG"
  println(country)
  println(county)
  println(age)

//  implicity defining the variable types
  val name = "Johndoe"
  var language = "kotlin"
  println("name")
  println(language)
//  kotlin data types
//  1.numbers
//      1.1 Intergers non decimal numbers
          var my_age:Int =23
            println(my_age)
            my_age =my_age+10
            println(my_age)
//      1.2 floats decimal numbers
          val height =3.56F
          println(height)
//  2.booleans;true or false
          val isloggedin:Boolean = true
          val isloggedout:Boolean = false
//  3.strings
  var length:Int =25
  var ruler:String="oxford"
  println("The length of the " + ruler+ " ruler is "+ length +" cm")
  println("The length of the  $ruler  ruler is $length  cm")
//  4.character;declared using single quotes
        val first_letter ='J'
        println(first_letter)
//  assinment
//  create two variables num_1 and num_2 storing 10 and 20 respectively
//  and calculate the sum of the two numbers
  var num_1:Int= 10
  var num_2:Int= 20
  var sum:Int= 0
  sum=num_1+num_2
  println(sum)

//  5.arrays


}