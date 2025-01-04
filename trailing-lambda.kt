val listOfNumbers = listOf(1, 2, 3, 4, 5);

val total = listOfNumbers.fold(0, { sum, element -> sum + element })

//in the form of a trailing lambda
val totalTrailing = listOfNumbers.fold(0) { sum, element -> sum + element }
fun main() {
    println(total)
    println(totalTrailing)
}