import kotlin.random.Random

var number = 0;
val check = false;

fun isLongName(name: String): Boolean {
    val isLong = if (name.length > 10) true else false //simulating ternary operator
    return isLong;
}

fun diceGame() {
    val firstResult = Random.nextInt(6);
    val secondResult = Random.nextInt(6);

    if (firstResult == secondResult) {
        println("You win")
    } else {
        println("You lose")
    }
}

fun main() {
    if (check) {
        number++;
        println("true")
    } else {
        println("false")
        number = -1
    }
    println(number)
    println(isLongName("rakib"))
    println(isLongName("md rakinbur rahman talukder"))
    println(diceGame())
}