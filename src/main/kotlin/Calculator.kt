fun main(){
    val num1 = 5
    val num2 = 6
    val sum = num1 + num2
    val multiple = num1 * num2
    val quotient = num1/ num2
    val remainder = num1 % num2
    val subtract = num1 - num2
    println("The sum is $sum \nThe multiple is $multiple \n" +
            "The quotient is $quotient \nThe remainder is $remainder \n" +
            "The difference is $subtract\n\n")


    val a = 1
    val b = true
    var c = 1
    val result: Int = -a
    println("-a = $result")
    val booleanResult: Boolean = !b
    println("!b = $booleanResult")
    --c
    println("--c = $c")
}