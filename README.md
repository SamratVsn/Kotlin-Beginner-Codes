# Kotlin Beginner Codes

> Learning Kotlin one program at a time

A collection of beginner-friendly Kotlin programs exploring core language features, logic building, and practical console applications. This repository documents my journey from Kotlin fundamentals to building functional programs.

---

## 🎯 About

This repository is my Kotlin learning playground. Each program tackles different aspects of the language — from basic syntax to object-oriented programming, from simple calculations to practical applications like banking systems and task management.

**Why Kotlin?** It's concise, expressive, and the modern choice for Android development. Understanding Kotlin means building better mobile apps with cleaner, safer code.

---

## 📂 Programs

### 🧮 Calculator
**File**: `Calculator.kt`

A console-based calculator performing basic arithmetic operations.

**Key Concepts**: Functions, when expressions, user input handling

---

### 🎲 Number Guess Game
**File**: `numberGuess.kt`

A number guessing game where you try to guess a randomly generated number with hints.

**Key Concepts**: Random number generation, loops, conditional logic, ranges

---

### 🏦 Bank Account Management
**File**: `bankAccountManagement.kt`

A simple banking system simulation with deposit, withdrawal, and balance checking functionality.

**Key Concepts**: Classes, objects, encapsulation, data validation

---

### ✅ To-Do Console
**File**: `toDoConsole.kt`

A command-line task manager to add, view, and remove tasks.

**Key Concepts**: Lists, mutable collections, CRUD operations

---

### 📏 Unit Converter
**File**: `unitConverter.kt`

A utility to convert between different units (length, weight, temperature, etc.).

**Key Concepts**: Functions, when statements, mathematical operations

---

### 🧩 Practice Problems
**File**: `Problems.kt`

A collection of small programming challenges and their solutions.

**Key Concepts**: Various Kotlin fundamentals and problem-solving patterns

---

## 🚀 Getting Started

### Prerequisites

- **Kotlin Compiler** or **IntelliJ IDEA** / **Android Studio**
- **JDK 8+** (Kotlin runs on the JVM)

### Running the Programs

#### Option 1: Using IntelliJ IDEA (Recommended)

1. **Clone the repository**:
```bash
   git clone https://github.com/SamratVsn/Kotlin-Beginner-Codes.git
```

2. **Open in IntelliJ IDEA**:
   - File → Open → Select the repository folder
   - IntelliJ will recognize it as a Kotlin project

3. **Run any file**:
   - Open the `.kt` file
   - Click the green ▶️ button next to the `main()` function

#### Option 2: Command Line

1. **Compile**:
```bash
   kotlinc Calculator.kt -include-runtime -d Calculator.jar
```

2. **Run**:
```bash
   java -jar Calculator.jar
```

#### Option 3: Kotlin Script (Quick Test)
```bash
kotlin Calculator.kt
```

---

## 📚 What I'm Learning

Through these programs, I'm developing skills in:

- **Kotlin Syntax**: Variables, data types, null safety
- **Control Flow**: if-else, when, loops (for, while)
- **Functions**: Parameters, return types, default arguments
- **OOP**: Classes, objects, inheritance, encapsulation
- **Collections**: Lists, sets, maps, and their operations
- **Input/Output**: Reading user input, console output
- **Problem Solving**: Breaking down problems into Kotlin code

---

## 🛠️ Repository Structure
```
Kotlin-Beginner-Codes/
├── Calculator.kt                # Basic calculator
├── numberGuess.kt              # Guessing game
├── bankAccountManagement.kt    # Banking simulation
├── toDoConsole.kt              # Task manager
├── unitConverter.kt            # Unit conversion tool
├── Problems.kt                 # Practice problems
└── README.md                   # You are here
```

---

## 🌟 Kotlin Features Explored

- ✅ Null Safety (`?`, `!!`, `?.`)
- ✅ Data Classes
- ✅ String Templates
- ✅ When Expressions
- ✅ Extension Functions
- ✅ Lambda Expressions
- ✅ Collections API
- ✅ Object-Oriented Programming

---

## 🔄 Next Steps

As I continue learning, I plan to add:

- File I/O operations (reading/writing files)
- More advanced OOP concepts (interfaces, abstract classes)
- Coroutines basics (asynchronous programming)
- Simple REST API client
- Mini Android app integration

---

## 💡 Tips for Learners

If you're also learning Kotlin:

1. **Run every program** — don't just read the code
2. **Modify and experiment** — change values, add features
3. **Break things** — see what happens when you do it wrong
4. **Use the REPL** — Kotlin's interactive shell is great for quick tests
5. **Read error messages** — Kotlin's compiler errors are informative

---

## 🤝 Contributing

This is a personal learning repository, but feedback is welcome! If you:

- Spot a bug or improvement
- Have suggestions for cleaner Kotlin code
- Want to suggest new beginner projects

Feel free to open an issue or submit a pull request.

---

## 📄 License

This project is open source and available for educational purposes.

---

## 🔗 Resources

- [Official Kotlin Documentation](https://kotlinlang.org/docs/home.html)
- [Kotlin Koans](https://play.kotlinlang.org/koans/overview) - Interactive exercises
- [Kotlin by Example](https://play.kotlinlang.org/byExample/overview)

---

> "The best way to learn Kotlin is to write Kotlin."
