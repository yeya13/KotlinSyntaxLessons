package `5_Quiz_Practice`

class Spice(val name: String, val spiciness: String = "light") {
    val heat: Int
        get() {
            return when (spiciness) {
                "light" -> 2
                "medium" -> 4
                "spicy" -> 6
                "very spicy" -> 8
                "hell" -> 10
                else -> 0
            }
        }
    init {
        println("Name: $name, Spiciness: $spiciness, Heat: $heat")
    }
}

fun makeSalt(): Spice {
    return Spice("Salt")
}

fun main() {
    val spices = listOf<Spice>(
        Spice("curry", "light"),
        Spice("pepper", "spicy"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "very spicy"),
        Spice("red curry", "very spicy"),
        Spice("green curry", "medium"),
        Spice("hot pepper", "hell")
    )
    val spice = spices.filter {
        it.heat < 6
    }
    fun makeSalt() = Spice("Salt")
}