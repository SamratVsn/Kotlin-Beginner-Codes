import kotlin.random.Random

class Account(val accId: String, initialBalance: Double = 0.0){
    private var balance: Double = initialBalance

    fun getBalance(): Double{
        return balance
    }

    fun deposit(amount:Double) : Boolean{
        if(amount > 0){
            balance += amount
            println("[✓] Deposit of $%.2f to Account $accId successfull.".format(amount))
            return true
        }
        else{
            println("[!] Deposit failed. Amount must be positive!")
            return false
        }
    }

    fun withdraw(amount: Double) : Boolean{
        if(amount > 0 && amount <= balance){
            balance -= amount
            println("[✓] Amount of $%.2f has been withdrawn from Account $accId".format(amount))
            return true
        }
        else if(amount > balance){
            println("[!] Withdrawal failed. Insufficient funds. Available: \$%.2f".format(balance))
            return false
        }
        else{
            println("[!] Withdrawal failed. Amount must be positive!")
            return false
        }
    }
}

class Customer(val customerId: Int, val name:String, val account: Account){
    override fun toString(): String{
        return "Customer ID: $customerId, Name: $name, Account ID: ${account.accId}"
    }
}

class Bank{
    private val customers: MutableMap<Int, Customer> = mutableMapOf()
    private val accountCounter = Random.Default
    private var customerIdCounter = 1000

    fun createAccount(name: String, initialDeposit: Double = 0.0): Customer{
        var customerId = customerIdCounter++
        val accId = "ACC-${accountCounter.nextInt(10000, 99999)}"

        val newAccount = Account(accId, initialDeposit)
        val newCustomer = Customer(customerId, name, newAccount)

        customers[customerId] = newCustomer
        println("\n-- New Account Created --")
        println(newCustomer)
        println("Initial Balance: $%.2f".format(newAccount.getBalance()))
        return newCustomer
    }

    fun findCustomer(customerId: Int): Customer? {
        return customers[customerId]
    }

    fun makeDeposit(customerId: Int, amount: Double){
        val customer = findCustomer(customerId)
        if(customer != null){
            println("\n--- Deposit Attempt for ${customer.name} (ID: $customerId) ---")
            customer.account.deposit(amount)
            println("New Balance: $%.2f".format(customer.account.getBalance()))
        }
        else {
            println("\n--- Deposit Failed ---")
            println("[!] Error: Customer with ID $customerId not found.")
        }
    }

    fun makeWithdrawal(customerId: Int, amount: Double){
        val customer = findCustomer(customerId)
        if(customer != null){
            println("\n--- Withdrawal Attempt for ${customer.name} (ID: $customerId) ---")
            customer.account.withdraw(amount)
            println("New Balance: $%.2f".format(customer.account.getBalance()))
        }
        else {
            println("\n--- Withdrawal Failed ---")
            println("[!] Error: Customer with ID $customerId not found.")
        }
    }

    fun checkBalance(customerId: Int){
        val customer = findCustomer(customerId)
        if(customer != null){
            println("\n--- Balance Inquiry for ${customer.name} (ID: $customerId) ---")
            println("Current Balance for Account ${customer.account.accId}: $%.2f".format(customer.account.getBalance()))
        }
        else {
            println("\n--- Balance Inquiry Failed ---")
            println("[!] Error: Customer with ID $customerId not found.")
        }
    }

    fun printAllCustomers() {
        if (customers.isEmpty()) {
            println("\nNo customers registered in the bank.")
            return
        }
        println("\n==================================")
        println("  BANK CUSTOMER & ACCOUNT SUMMARY")
        println("==================================")
        customers.values.forEach { customer ->
            println("ID: ${customer.customerId} | Name: ${customer.name} | Account ID: ${customer.account.accId} | Balance: $%.2f".format(customer.account.getBalance()))
        }
        println("==================================")
    }
}

fun main(){
    val myBank = Bank()

    println("====================================")
    println(" Welcome to the Kotlin Bank Manager ")
    println("====================================")

    //creating pre-accounts for testing & entertainment purpose
    myBank.createAccount("Ram Chandra", 10000.0)
    myBank.createAccount("Samrat Parajuli", 100000.0)

    while(true){
        println("\n--- Main Menu ---")
        println("1. Create New Account")
        println("2. Deposit Funds")
        println("3. Withdraw Funds")
        println("4. Check Balance")
        println("5. View All Customers")
        println("6. Account Details")
        println("7. Exit")
        print("Enter your choice (1-6): ")
        when(readln()?.toIntOrNull()){
            1 -> createNewAcc(myBank)
            2 -> transactionHandle(myBank, "deposit")
            3 -> transactionHandle(myBank, "withdraw")
            4 -> checkTotalBalance(myBank)
            5 -> myBank.printAllCustomers()
            6 -> myAccountDetails(myBank)
            7 -> {
                println("\n========================================================")
                println("Thank you for using the Kotlin Bank Manager! Goodbye.\nCredits: Samrat Parajuli")
                println("========================================================")
                return
            }
            else -> println("[!] Invalid option. Please enter a number between 1 and 6.")
        }
    }
}

fun createNewAcc(bank: Bank){
    print("Enter customer name: ")
    val name = readlnOrNull()?.trim()
    //trim to get proper value without blank spaces

    if(name.isNullOrEmpty()){
        println("[!] Name cannot be empty. Account creation cancelled.")
        return
    }

    print("Enter Initial Deposit Amount: ")
    val depoAmt = readlnOrNull()
    val initialDeposit = depoAmt?.toDoubleOrNull() ?: 0.0

    if(initialDeposit < 0){
        println("[!] Initial deposit cannot be negative. Account creation cancelled.")
        return
    }
    bank.createAccount(name, initialDeposit)
}

fun transactionHandle(bank: Bank, type: String){
    print("Enter Customer ID: ")
    val initInput = readlnOrNull()
    val customerId = initInput?.toIntOrNull()

    if(customerId == null){
        println("[!] Invalid Customer ID format.")
        return
    }

    print("Enter Amount to ${type}: ")
    val amountInp = readlnOrNull()
    val amount = amountInp?.toDoubleOrNull()

    if(amount == null || amount <= 0){
        println("[!] Invalid amount. Amount must be a positive number.")
        return
    }

    if (type == "deposit") {
        bank.makeDeposit(customerId, amount)
    }
    else {
        bank.makeWithdrawal(customerId, amount)
    }
}

fun checkTotalBalance(bank: Bank){
    print("Enter Customer ID: ")
    val idInput = readlnOrNull()
    val customerId = idInput?.toIntOrNull()

    if (customerId == null) {
        println("[!] Invalid Customer ID format.")
    } else {
        bank.checkBalance(customerId)
    }
}

fun myAccountDetails(bank: Bank){
    print("Enter Customer ID: ")
    val idInput = readlnOrNull()
    val customerId = idInput?.toIntOrNull()

    if(customerId == null){
        println("[!] Invalid Customer ID format.")
        return
    }

    val customer = bank.findCustomer(customerId)
    if (customer == null) {
        println("[!] Customer with ID $customerId not found.")
        return
    }
    println("\n--- Account Details ---")
    println("ID: ${customer.customerId} \nName: ${customer.name} \nAccount ID: ${customer.account.accId}  \nBalance: $%.2f"
        .format(customer.account.getBalance()))
}