package `5_Practice_Time`

fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }
    return result
}

fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9,0)
    println(numbers.divisibleBy { it.rem(3) })
}