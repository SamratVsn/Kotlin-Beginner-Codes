val toDo = mutableListOf<String>()

fun main(){
    println("========================================")
    println("\t WELCOME TO T0-D0 CLI")
    println("========================================")
    var running = true
    while(running){
        println("\n---------------------------------------------")
        println("1) (+_+) Add task")
        println("2) (O.O) View all tasks")
        println("3) (X_X) Delete task")
        println("4) (ಠ_ಠ) Exit")
        println("---------------------------------------------")
        print("\nEnter a choice: ")
        when(readln()?.toIntOrNull()){
            1 -> addTask()
            2 -> viewTask()
            3 -> deleteTask()
            4 -> {
                running = false
                println("[OK] THANK YOU FOR USING")
            }

            else -> println("[!] Invalid Choice. Please enter a specified number ( 1- 4)!!\n")
        }
    }
}

fun addTask(){
    println("----------------------------------------")
    println("                ADD TASK")
    println("----------------------------------------")
    print("Enter task: ")
    val task = readLine()
    if(!task.isNullOrBlank()){
        toDo.add(task.trim())
        println("\n[OK] Task added successfully.")
        println("Added Task: \"$task\"")
    }
    else{
        println("\n[!] Invalid input.Please enter a valid task!!\n")
        println("----------------------------------------\n")
    }
}

fun viewTask(){
    println("----------------------------------------")
    println("               VIEW TASKS")
    println("----------------------------------------")

    if(toDo.isEmpty()){
        println("[!] No tasks available.")
        println("You can add tasks from the main menu.")
    }
    else{
        println("Your Tasks:")
        println("----------------------------------------")
        toDo.forEachIndexed { index, task ->
            println("${index + 1}. $task")
        }
        println("----------------------------------------\n")
    }
}

fun deleteTask(){
    println("----------------------------------------")
    println("               DELETE TASK")
    println("----------------------------------------")
    if(toDo.isEmpty()){
        println("[!] Nothing to delete yet!!!")
        println("----------------------------------------\n")
        return
    }
    println("Current Tasks: ")
    println("----------------------------------------")
    toDo.forEachIndexed { index, task ->
        println("${index + 1}. $task")
    }
    println("----------------------------------------")
    print("Enter the task number to delete: ")
    val input = readLine()?.toIntOrNull()

    if(input != null){

        val toDeleteTask = input - 1

        if(toDeleteTask in 0 until toDo.size){
            val taskRemoved = toDo.removeAt(toDeleteTask)
            println("\n[OK] Task deleted successfully.")
            println("Removed: \"$taskRemoved\"")
        }
        else{
            println("\n[!] Invalid number. Please enter a valid task number.")
        }
    }
    else{
        println("\n[!] Invalid input. Please enter a numeric value.")
    }
    println("----------------------------------------\n")
}