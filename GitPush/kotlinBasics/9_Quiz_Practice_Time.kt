// Part 1
val trout: String = "trout"
val haddock: String = "haddock"
val snapper: String = "snapper"

"I like $trout and $haddock, but I don't like $snapper"

//Part 2
val fishName: String = "haddock"
when (fishName.length){
    0 -> println("Error")
    in 3..12 -> println("Good fish name")
    else -> println("OK fish name")
}

