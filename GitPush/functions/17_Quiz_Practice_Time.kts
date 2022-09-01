
val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

//gets all the curries and sorts them by string length
val curry = spices.filter { it.contains("curry") }.sortedBy { it.length }
val ce = spices.filter { it[0] == 'c' && it[it.length - 1] == 'e' }

//all the spices that start with 'c' and end in 'e'
val ce2 = spices.filter { it.first() == 'c' && it.last() == 'e' }

//the first three elements of the list and return the ones that start with 'c'
val i3 = spices.take(3).filter{it.first() == 'c'}

println(curry)
println(ce)
println(ce2)
println(i3)

