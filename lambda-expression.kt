// usual function
fun uppercaseString(text: String): String {
    return text.uppercase()
}

//lambda expression
val uppercaseStringLambda = { text: String -> text.uppercase() }

val numbers = listOf(1, -2, 3, -4, 5, -6);

val positiveNumbers = numbers.filter({ num -> num > 0 })

val isNegative = { num: Int -> num < 0 };

val isTripled = { num: Int -> num * 3 }

//  pass a lambda expression to a function
val negativeNumbers = numbers.filter(isNegative);
val tripledNumbers = numbers.map(isTripled);

// Return lambda expression from a function
fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}

fun timeConverter() {
    val timesInMinutes = listOf(2, 10, 15, 1);
    val min2sec = toSeconds("minute");
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum();
    println("Total time is $totalTimeInSeconds secs")
}

fun main() {
    println(uppercaseString("rakib"))
    println(uppercaseStringLambda("hello")) //invoke lambda expression
    println(positiveNumbers)
    println(negativeNumbers)
    println(tripledNumbers)
    timeConverter()
}