
fun doubleSort(): List<Any> {
    var array = mutableListOf(1, 4, 2, 3, "z", "2", "3", "q", "a", "c", "d", "b")
    val onlyNumbers = array.filterIsInstance<Int>().sorted()
    val getStrings = array.filterIsInstance<String>().sorted()

    return onlyNumbers + getStrings
}

fun main(){
   println(doubleSort())
}