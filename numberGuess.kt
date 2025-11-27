fun main(){
    println("========================================")
    println("\t WELCOME TO GUESS IT")
    println("========================================")
    var running = true
    while(running){
        println("MAIN GAME")
        println("---------------------------------------------")
        println("1) Easy")
        println("2) Normal")
        println("3) Hard")
        println("4) Impossible")
        println("5) Random")
        println("6) Exit")
        println("---------------------------------------------")
        print("Choose One: ")
        when(readLine()?.toIntOrNull()){
            1 -> easyMode()
            2 -> normalMode()
            3 -> hardMode()
            4 -> impossibleMode()
            5 -> randomMode()
            6 -> {
                running = false
                println("\nTHANKS FOR PLAYING")
                println("Game Credits: Samrat Parajuli")
            }
            else -> println("[!] Invalid Number. Please inter number from 1 to 6!!\n")
        }
    }
}

fun easyMode(){
    println("\n----------------------------------------")
    println("                Game Mode: Easy")
    println("----------------------------------------")
    val randEs = (0 .. 25).random()
    mainGame(randEs)
}
fun mainGame(ans: Int) {
    var guessCount = 0
    print("Guess a number: ")
    while (true) {
        val guess = readLine()?.toIntOrNull()
        if (guess == null) {
            println("[!] Please enter a valid number!")
            print("Guess: ")
            continue
        }
        guessCount++
        when {
            guess < ans -> print("[!] Guess a bigger number: ")
            guess > ans -> print("[!] Guess a smaller number: ")
            else -> {
                println("\n---------------------------------------------")
                println("\n[WOAH] Congrats! The right answer was: $ans")
                println("The number of attempts: $guessCount")
                println("\n---------------------------------------------")
                break
            }
        }
    }
}

fun normalMode(){
    println("\n----------------------------------------")
    println("                Game Mode: Normal")
    println("----------------------------------------")
    val randNorm = (0 .. 100).random()
    mainGame(randNorm)
}

fun hardMode(){
    println("\n----------------------------------------")
    println("                Game Mode: Hard")
    println("----------------------------------------")
    val randHd = (0 .. 1000).random()
    mainGame(randHd)
}

fun impossibleMode(){
    println("\n----------------------------------------")
    println("                Game Mode: Impossible")
    println("----------------------------------------")
    val randImp = (0 .. 1000000).random()
    mainGame(randImp)
}

fun randomMode(){
    val rand = (1 .. 4).random()
    when(rand){
        1 -> easyMode()
        2 -> normalMode()
        3 -> hardMode()
        4 -> impossibleMode()
        else -> return println("ERROR!!")
    }
}