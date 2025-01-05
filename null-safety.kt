fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

fun lengthString(maybeString: String?): Int? = maybeString?.length //safe call operator ?.
data class EmployeeData(val name: String, var salary: Int)

fun employeeById(id: Int) = when (id) {
    1 -> EmployeeData("John", 228)
    2 -> EmployeeData("Jane", 128)
    3 -> null
    4 -> EmployeeData("Mary", 28)
    else -> null
}

// Elvis operator
fun salaryById(id: Int) = employeeById(id)?.salary ?: 0;

fun main() {
    val nullString: String? = null
    println(describeString(nullString))
    println(lengthString(null))
    println(nullString?.length ?: "Empty string")
    println(salaryById(1))
    println(salaryById(12))

}