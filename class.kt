class Contact(val name: String, var number: String) {
    val email: String = ""
    fun getInfo(){
        println("Name: $name, number: $number")
    }
}

val contact = Contact("Alice", "123.456.789"); //Create instance

fun main() {
    println(contact.name)
    contact.number ="01829661796"
    println(contact.number)
    contact.getInfo()
}