// Read only list
val fruits:List<String> = listOf("Banana","Mango")

val games:MutableList<String> = mutableListOf("Witcher 3","Uncharted","Far Cry","WWE");

val names:MutableList<String> = mutableListOf("John","Peter","Jane")

fun addGame(game:String){
    println("$game added to the list")
    games.add(game)
}

fun removeGame(game:String){
    println("$game removed from the list")
    games.remove(game)
}

fun main(){
    names.add("nusaiba")
    println("First Name ${names.first()}")
    println("----")
    println("First game ${games[0]}")
    println("Last game ${games.last()}")
    println(names)
    println(games)
    println("There are ${games.count()} games")
    addGame("Plague Tale")
    removeGame("WWE")
    println("Games after modification $games")
}