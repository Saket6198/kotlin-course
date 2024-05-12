fun main(){
    var x: Int = 5
    var y = 3
    var z = 3.0
    val result = x + y
    println("result = $result")
    println("result = ${x+y}")
    println("result = ${x-y}")
    println("result = ${x*y}")
    println("result = ${x/y}")
    println("result = ${x/z}") //cannot use true division

    println("result = ${x%y}")
    var int = 0
    println("x=${x++}")
    println("x= ${++x}")
    println("x=${x--}")
    println("x= ${--x}")
    val isActive: Boolean = true
    if(isActive) //checks if the variable is set or not
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
println("result = ${x-y} and x = $x and y = $y")
}