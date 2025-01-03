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

fun buttonAction(btn: String): String {
    val action = when (btn) {
        "A" -> "Yes"
        "B" -> "No"
        "X" -> "Menu"
        "Y" -> "Nothing"
        else -> "There is no such button"
    }
    return action;
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
    println(buttonAction("A"));
    println(buttonAction("Y"));
    println(buttonAction("X"));
    println(buttonAction("B"));
    println(buttonAction("LB"))
}
