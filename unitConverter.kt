fun main(){
    println("=========================================")
    println("\t\tBASIC UNIT CONVETER")
    println("=========================================")
    var running = true
    while(running){
        println("-----------------------------------")
        println("1) Celsius to Fahrenheit")
        println("2) Fahrenheit to Celsius")
        println("3) Kilometers to Miles")
        println("4) Miles to Kilometers")
        println("5) Kilogram to Pound(lbs)")
        println("6) Liter to Gallon")
        println("7) Exit")
        print("Enter a option: ")
        when(readln()?.toIntOrNull()){
            1 -> celFahr()
            2 -> fahrCel()
            3 -> kilMile()
            4 -> mileKil()
            5 -> kilPou()
            6 -> litGall()
            7 -> {
                println("\n[!][!][!] THANKS FOR USING\nCode Credits: Samrat Parajuli")
                running = false
            }
            else -> println("[!] Invalid Input. Enter a number from 1 to 7!")
        }
    }
}

fun celFahr(){
    println("\n--------------------------------------")
    println("\t\tCelsius to Fahrenheit")
    println("--------------------------------------")
    print("Enter celsius temperature: ")
    val cels = readln()?.toIntOrNull()
    if(cels == null){
        println("[!] Enter a valid Number!!\n")
    }
    else{
        val fahr: Double = (cels * (9.0 / 5.0)) + 32
        println("Fahrenheit: $fahr")
    }
}

fun fahrCel(){
    println("\n--------------------------------------")
    println("\t\tFahrenheit to Celsius")
    println("--------------------------------------")
    print("Enter fahrenheit temperature: ")
    val fahr = readln()?.toIntOrNull()
    if(fahr == null){
        println("[!] Enter a valid Number!!\n")
    }
    else{
        val cels: Double = (fahr - 32) * (5.0 / 9.0)
        println("Celsius: $cels")
    }
}

fun kilMile(){
    println("\n--------------------------------------")
    println("\t\tKilometers to Miles")
    println("--------------------------------------")
    print("Enter kilometer distance: ")
    val kilo = readln()?.toIntOrNull()
    if(kilo == null){
        println("[!] Enter a valid Number!!\n")
    }
    else{
        val mile = kilo * 0.621371
        println("Mile: $mile")
    }
}

fun mileKil(){
    println("\n--------------------------------------")
    println("\t\tMiles to Kilometers")
    println("--------------------------------------")
    print("Enter mile distance: ")
    val mile = readln()?.toIntOrNull()
    if(mile == null){
        println("[!] Enter a valid Number!!\n")
    }
    else{
        val kilo = mile * 1.60934
        println("Kilometer: $kilo")
    }
}

fun kilPou(){
    println("\n--------------------------------------")
    println("\t\tKilogram to Pound(lbs)")
    println("--------------------------------------")
    print("Enter kilogram mass: ")
    val kg = readln()?.toIntOrNull()
    if(kg == null){
        println("[!] Enter a valid Number!!\n")
    }
    else{
        val pound: Double = kg * 2.20462
        println("Pound: $pound")
    }
}

fun litGall(){
    println("\n--------------------------------------")
    println("\t\tLiter to Gallon")
    println("--------------------------------------")
    print("Enter liter: ")
    val lit = readln()?.toIntOrNull()
    if(lit == null){
        println("[!] Enter a valid Number!!\n")
    }
    else{
        val gallon = lit * 0.264172
        println("Gallon: $gallon")
    }
}