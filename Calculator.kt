fun main(){
    println("Welcome to CLI Calculator by Samrat \n")
    print("Enter a number: ")
    val num1 = readln()!!.toDouble()
    print("\nEnter an operator( + , -, *, /): ")
    val oper = readln()!!
    print("\nEnter another number: ")
    val num2 = readln()!!.toDouble()

    when(oper){
        "+" -> sum(num1, num2)
        "-" -> diff(num1, num2)
        "*" -> mult(num1, num2)
        "/" -> div(num1, num2)
        else -> opereratorError()
    }
}

fun sum(a: Double, b:Double){
    println("\n$a + $b = ${a + b}")
}

fun diff(a: Double, b:Double){
    println("\n$a - $b = ${a - b}")
}

fun mult(a: Double, b:Double){
    println("\n$a x $b = ${a * b}")
}

fun div(a: Double , b:Double){
    if( b.toInt() == 0 ){
        println("Division is not possible")
    }
    else{
        println("\n$a / $b = ${a / b}")
    }
}

fun opereratorError(){
    println("\nPlease enter a valid operator & try again!!!")
}