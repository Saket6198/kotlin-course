fun main(){
    var x = 5
    var y = 3
    var z = 3.0
    var result = x + y
    println("result = $result")
    println("result = ${x+y}")
    println("result = ${x-y}")
    println("result = ${x*y}")
    println("result = ${x/y}")
    println("result = ${x/z}")

    println("result = ${x%y}")
    var int = 0
    println("x=${x++}")
    println("x= ${++x}")
    println("x=${x--}")
    println("x= ${--x}")
    val isActive: Boolean = true
    if(!isActive)
        println("User is Active")
    else
        println("not Active!")
    val myno = 100
    if(myno <= 150)
        println("greater")
    else if(myno == 100)
        println("same")
    else
        println("None!")
//    same conditional operators from C for and or and ne,e,ge, le etc

}