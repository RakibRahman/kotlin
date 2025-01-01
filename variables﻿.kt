val name = "Rakib"
var age = 23

fun printName(name: String) {
    println("My name is $name")
}

fun personalInfo() {
    println("My name is $name, i'm $age years old")
}

fun main() {
    age = 28;
    println(age)
    printName("Rakib")
    personalInfo();
}