import kotlin.random.Random

fun main(){
        val rollDiceSides = { Random.nextInt(12) + 1 }
        val rollDice = { sides: Int ->
            if (sides == 0) 0
            else Random.nextInt(sides) + 1
        }
        repeat(10) {
            println("${rollDice(0)}")
        }
        val rollDice2: (Int) -> Int = { sides: Int ->
            if (sides == 0) 0
            else Random.nextInt(sides) + 1
        }
    }

main()