fun replaceVowels(s: String): String {
    val vowels = "aeiouAEIOU".split("").filter { it.isNotEmpty() }
    var output = ""
    for (char in s) {
        if (vowels.contains(char.toString())) {
            output += "!"
        } else {
            output += char
        }
    }
    return output
}

//with regex
fun replaceVowelsV2(s: String): String {
    return s.replace(Regex("[aeiouAEIOU]"), "!");
}

//forEach loop example
fun replaceVowelsV3(s: String): String {
    var output = "";
    s.forEach { char ->
        if (char.lowercase() in "aeiou") {
            output += "!"
        } else {
            output += char
        }
    }
    return output
}


fun main() {
    println(replaceVowels("apple"))
    println(replaceVowels("aeiou"))
    println(replaceVowelsV2("umbrella"))
    println(replaceVowelsV3("umbrella"))
    println(replaceVowelsV3("Elephant"))
}