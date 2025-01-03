val readOnlyNames = setOf("John", "Peter", "Jane");
val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")

val gamesSet = mutableSetOf("Witcher 3", "Uncharted", "Far Cry", "WWE","Far Cry");

fun isSupported(){
        val requested = "smtp"
        val isSupported = requested.uppercase() in SUPPORTED
        println("Support for $requested: $isSupported")
}


fun main(){
    println(readOnlyNames)
    println("Name set has ${readOnlyNames.count()} names")
    gamesSet.add("Naruto Ninja War")
    gamesSet.remove("Far Cry")
    println(gamesSet)
    println(isSupported())
}