import kotlin.random.Random

class Contact(val name: String, var number: String) {
    val email: String = ""
    fun getInfo() {
        println("Name: $name, number: $number")
    }
}

val contact = Contact("Alice", "123.456.789"); //Create instance

data class User(val name: String, val id: Int);

val user = User("Alex", 1)
val secondUser = User("Alex", 1)
val thirdUser = User("Max", 2)
val copyUser = user.copy(id = 4)


data class Employee(val name: String, var salary: Int);

class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    val names = listOf("Alice", "Alex", "Max");
    fun generateEmployee() = Employee(names.random(), Random.nextInt(minSalary, maxSalary))
}

fun main() {
    println(contact.name)
    contact.number = "01829661796"
    println(contact.number)
    contact.getInfo()
    println(user)
    println("user == secondUser: ${user == secondUser}") // Compare instances
    println("user == thirdUser: ${user == thirdUser}")
    println(copyUser)
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}