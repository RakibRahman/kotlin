val readOnlyNames = setOf("John", "Peter", "Jane");

val gamesSet = mutableSetOf("Witcher 3", "Uncharted", "Far Cry", "WWE","Far Cry");


fun main(){
    println(readOnlyNames)
    println("Name set has ${readOnlyNames.count()} names")
    gamesSet.add("Naruto Ninja War")
    gamesSet.remove("Far Cry")
    println(gamesSet)
}