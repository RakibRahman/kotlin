var number = 0;
val check = false;

fun isLongName(name: String): Boolean {
    val isLong = if (name.length > 10) true else false //simulating ternary operator
    return isLong;
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

}