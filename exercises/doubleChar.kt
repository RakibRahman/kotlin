fun doubleChar(s: String): String {
    var final = ""
    for (char in s) {
        final += "$char$char"
    }
    return final
}

fun doubleCharV2(s: String):String {
    return s.map { "$it$it" }.joinToString("")
}

fun main() {
    println(doubleChar("String"))
    println(doubleCharV2("rakib"))
}