//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Part A: Summing numbers from 1 to a specified maximum
    val max = 10
    println("Sum of numbers from 1 to $max is: ${sumUpTo(max)}")

    // Part B: Calculating the factorial of a number using an iterative approach
    val num = 5
    println("Factorial of $num (Iterative) is: ${factorialIterative(num)}")

    // Part C: Calculating the factorial using a lambda expression
    val number = 5
    println("Factorial of $num (Lambda) is: ${factorialLambda(number)}")

    // Part D: Calculating the factorial using recursion
    println("Factorial of $num (Recursive) is: ${factorialRecursive(num)}")
}

// Part A - Function to sum integers from 1 to a given maximum number
fun sumUpTo(max: Int): Int {
    var sum = 0 // Initialize sum to 0
    for (number in 1..max) { // Loop from 1 to max
        sum += number // Add each number to the sum
    }
    return sum // Return the final sum
}

// Part B - Iterative Function to calculate factorial of a number
fun factorialIterative(n: Int): Int {
    var result = 1 // Start with 1 since factorials involve multiplication
    for (num in 1..n) { // Loop from 1 to n
        result *= num // Multiply result by the current number
    }
    return result // Return the computed factorial
}

// Part C - Lambda Expression for calculating factorial
val factorialLambda: (Int) -> Long = { n ->
    var result = 1L // Use Long type to handle large factorials
    for (i in 1..n) { // Loop from 1 to n
        result *= i // Multiply result by the current number
    }
    result // Return the factorial result
}

// Part D - Recursive Function to calculate factorial of a number
fun factorialRecursive(n: Int): Int {
    return if (n <= 1) 1 // Base case: factorial of 0 or 1 is 1
    else n * factorialRecursive(n - 1) // Recursive case: n * factorial(n-1)
}
