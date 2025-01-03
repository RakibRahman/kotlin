val cakes = listOf("carrot", "cheese", "chocolate");
val words = listOf("dinosaur", "limousine", "magazine", "language")

fun fizzBuzz() {
    for (number in 1..100) {
        if (number % 3 == 0) {
            println("fizz")
        }
        if (number % 5 == 0) {
            println("buzz")
        }
    }
}

fun fizzBuzz2() {
    for (number in 1..100) {
        when {
            (number % 15 == 0) -> println("FizzBuzz")
            (number % 3 == 0) -> println("fizz")
            (number % 5 == 0) -> println("Buzz")
            else -> println("$number")
        }
    }
}

fun workChecker(){
    for (word in words) {
        if(word.startsWith("l")){
            println(word)
        }
    }
}

fun main() {
    for (num in 1..10) {
        println("$num ")
    }
    for (cake in cakes) {
        println(cake)
    }
    workChecker()
}