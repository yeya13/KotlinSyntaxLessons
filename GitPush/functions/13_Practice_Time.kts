fun main(){
    println(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday(mood: String, weather: String="Sunny", temperature: Int = 24): String{
    return when {
        mood == "happy" && weather == "Sunny" -> "go for a walk"
        else -> "Stay home and read."
    }
}

main()