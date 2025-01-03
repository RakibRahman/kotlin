fun whileLoop() {
    var pizzaSlices = 0
    while (pizzaSlices < 7) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

fun doWhileLoop() {
    var pizzaSlices = 0
    do {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    } while (pizzaSlices < 7)
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")

}

fun main() {
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten <= 3) {
        println("eating $cakesEaten")
        cakesEaten++
    }

    do {
        cakesBaked++
        println("baking cake")
    } while (cakesBaked < cakesEaten)

    whileLoop();
    println("---")
    doWhileLoop();
}

