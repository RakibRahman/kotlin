import kotlin.math.PI;

//  single-expression function.
fun circleArea(radius: Int): Double = PI * radius * radius;


//Default parameter values
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun main() {
    println(circleArea(2))
    printMessageWithPrefix("code","mode")
    printMessageWithPrefix(message = "Info", prefix = "Info")  // Uses named arguments with swapped parameter order
}

