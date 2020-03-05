package assn

fun main(args: Array<String>) {


//fun that takess in number of characters
//calculates the sum of two numbers
//area of a circle
//takes in a number to find  if a number is odd or even
fun volume(radius:Int,height:Int){
    val p :Float = 3.142f
    val volume = p* height* radius * radius
    print ("the volume is $volume")

}
//    finds a number which is a multiple of 3 and 5
    fun check(num1:Int){
    if(num1%15==0){
        println("$num1 is a multiple of 3 and 5")
    }else{
        println("$num1 is not a multiple of 3 and 5")
    }
}
    check(14)
}
