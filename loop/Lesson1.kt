package loop
//for loop
fun main(args: Array<String>) {
//    incrementing by 2
    for (i in 1..20 step 2){
        if(i == 4){
            println("$i is equal to 4")
        }else{
            println("$i is not equal to 4")
        }
    }

//    printing in reverse order
    for (i in 20 downTo 1){
        println(i)
    }


//    while loop
    var a = 0
    while (a < 10){
        println(a)
        a++
    }


    var b = 1
    do{
        println(b)
        b++
    }while (b < 10)



//    assignment : fizzbuzz
//    3 fizz    5 buzz    both fizzbuzz

  var x:Int = 0
    for(x in 0..100 step 1){
        if(x % 15 == 0){
            println("$x is fizzbuzz")
        }else if(x % 3 == 0){
            println("$x is fizz")
        }else if(x % 5 == 0){
            println("$x is buzz")
        }else{
            println("$x")
        }

    }










}