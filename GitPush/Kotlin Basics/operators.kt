//operations
1+1

53-3

50/10

1/2

1.0/2.0

6*50

//use primitive  "int" as an object
1.toLong()

//or, put in a box
val boxed: Number = 1
boxed.toLong()

val aquarium = 1

//here it will return the value of aquarium
aquiarium

//here there will be an error
aquarium = 2

var fish = 2

//here it will return the value of fish
fish

//here we change the value
fish = 50

//here it will return the new value of fish
fish

/*Here there will be an error because
we can´t change the type of variable once
it's type has been determined*/
fish = "Bubbles"

//We can use variables in operations
val plants = 5
val fish = 2
fish + plants

/*here there will be an error because
can´t be a value null*/
var rocks: Int = null

/*question mark operator indicate
that variable can be null*/
var marbles: Int? = null
var lotsOfFish: List <String?> = listOf(null, null)

//Elvis operator: if the variable is null, assign the value
var fishFoodTreats = 5
return fishFoodTreats?.dec() ?: 0




