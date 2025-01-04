// usual function
fun uppercaseString(text: String): String {
    return text.uppercase()
}


//lambda expression
val uppercaseStringLambda = { text: String -> text.uppercase() }

fun main() {
    println(uppercaseString("rakib"))
    println(uppercaseStringLambda("hello"))
}