fun main(args: Array<String>) {
    val alarm: Int = 12
    when (alarm) {
        12 -> println("the Time is $alarm")
        14 -> println("the Time is $alarm")
        7 -> println("the Time is $alarm")
        else -> println("the time is $alarm")
//only the correct value will be executed
    }
    val alarm3: Int = 13
    when (alarm3) {
        12 -> println("the Time is $alarm3")
        14 -> println("the Time is $alarm3")
        7 -> println("the Time is $alarm3")
        else -> println("else the time is $alarm3")
//only the else value will be executed
    }
    when (val alarm2 = 7) {
        12, 7, 14 -> println("The time is : $alarm2") //shortened version of first block

    }
    when (val alarm4 = 5) {
        in 1..10 -> println("The alarm is : $alarm4") //'in' keyword is used for range checking in when block
    }
    val text = when (val alarm5 = 2) {  //declaration moved to when
        in 1..10 -> {  // curly braces are used when we want to execute more than one line of code in that block
            "The alarm is range 1-10 : $alarm5"
        }

        2, 3 -> {
            "The alarm is Only b/w 2 &3 : $alarm5"
        }

        else -> {
            "The number is out of range from 1..10 : $alarm5"
        }
    }
    println(text) //when taken inside another variable
    //executes like a switch block
    val alarm6: Int = 11
    when {   //no need to put variable inside when parameter when not using literals
        alarm6 < 7 -> println("Alarm is less than 7 i.e. $alarm6")
        (alarm6 == 7 || alarm6 == 8) -> println("$alarm6")
        else -> println("Out of range i.e. $alarm6")
    }
}