import kotlin.math.PI;

//  single-expression function.
fun circleArea(radius: Int): Double = PI * radius * radius;


//Default parameter values
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

//Taking Functions as Parameters

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y);
}

fun sum(x: Int, y: Int): Int = x + y;

//Returning Functions
fun totalValue(): (Int, Int) -> Int {
    return ::sum
}

fun main() {
    println(circleArea(2))
    printMessageWithPrefix("code", "mode")
    printMessageWithPrefix(message = "Info", prefix = "Info")  // Uses named arguments with swapped parameter order
    println(calculate(2, 2, ::sum))
    val func = totalValue()
    println(func(10, 20))
}

