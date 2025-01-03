val framwork = "react";
val language = "kotlin";
val trafficLightState = "Red";


fun checkTrafficAction(str: String): String {
    //when expression without a subject
    val trafficAction = when {
        str == "Green" -> "Go"
        str == "Yellow" -> "Slow Down"
        str == "Red" -> "Stop"
        else -> "Unknown error"

    }
    return trafficAction
}

fun main() {     // when as a statement
    when (framwork) {
        "vue" -> println("vue")
        "react" -> println("react")
        else -> println("unknown")
    }

    //when as expression
    val result = when (language) {
        "kotlin" -> "kotlin"
        "java" -> "java"
        else -> "unknown"
    }
    println(result)

    println(checkTrafficAction(trafficLightState))
}
