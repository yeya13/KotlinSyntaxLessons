import kotlin.random.Random
fun main() {
    val dice = { sides: Int ->
        Random.nextInt(sides) + 1
    }
    val rollDice2: (Int) -> Int = { sides: Int ->
        if (sides == 0) 0
        else Random.nextInt(sides) + 1
    }
    gamePlay(dice, rollDice2)
}

fun gamePlay(dice: (Int) -> Int, dice2: (Int) -> Int) {
    println(dice2(6))
    println(dice(4))
}
main()