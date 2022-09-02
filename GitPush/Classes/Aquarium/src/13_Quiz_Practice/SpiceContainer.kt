package `13_Quiz_Practice`

abstract class Spice(val name: String, val spiciness: String = "light") {
}

class Curry(name: String, spice: String): Spice(name, spice) {
}

data class SpiceContainer(
    val spice: Spice,
    val label: String = spice.name,
    val spiciness: String = spice.spiciness
)

fun main() {
    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "light")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy")))

    for (element in spiceCabinet) {
        println("${element.label}, ${element.spiciness}")
    }
}