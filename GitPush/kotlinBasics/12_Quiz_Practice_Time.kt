//Basic example
var numbers : IntArray = intArrayOf(11, 12, 13, 14, 15)
var List : MutableList<String> = mutableListOf<String>()

for (number in numbers) {
    List.add(number.toString())
}
println(List)

//Challenge example
var ListN : MutableList<Int> = mutableListOf<Int>()
for (num: Int in 0..100){
    if (num % 7 == 0) {
        ListN.add(num)
    }
}
println(ListN)