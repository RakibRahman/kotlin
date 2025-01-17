fun isDigit(c: Char) = c in '0'..'9'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun main() {
    val number = 102
    println(number in 0..105)
    println("r" in "Rakib")
    println("R" in "Rakib")
    println(isDigit('2'))
    println(isDigit('a'))
    println("--")
    println(isNotDigit('2'));
    println(isNotDigit('a'));

}
