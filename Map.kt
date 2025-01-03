//Read-only map
data class FoodItem(val name: String);

val readOnlyFoodMenu = mapOf("burger" to 100, "pizza" to 150, "sandwich" to 80);
val foodMenu = mutableMapOf("cheese" to 30, "sauce" to 15, "salad" to 20);
val foodMenuWithDataClass: Map<FoodItem, Number> =
    mutableMapOf(FoodItem("cheese") to 30, FoodItem("sauce") to 15, FoodItem("salad") to 20)

fun valueExistsInMap(map:Map<String,Int>,key:String): Boolean {
    return map.containsKey(key)
}

fun main() {
    foodMenu["bread"] = 10
    println(readOnlyFoodMenu)
    println(foodMenu)
    println(foodMenu["pizza"])
    println(foodMenu["salad"])
    foodMenu.remove("sauce")
    println(foodMenu)
    println(foodMenuWithDataClass[FoodItem("cheese")])
    println(valueExistsInMap(foodMenu,"burger")) //false
    println(valueExistsInMap(foodMenu,"cheese")) //true
    println("get keys of foodMenu ${foodMenu.keys}")
    println("get values of foodMenu ${foodMenu.values}")
    println("orange" in foodMenu) //false
    println("cheese" in foodMenu) //true
    println(30 in foodMenuWithDataClass.values)
}
