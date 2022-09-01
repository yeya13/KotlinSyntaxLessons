fun main(){
    println(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday(mood: String, weather: String="sunny", temperature: Int = 24): String{
    return when {
        mood == "happy" && weather == "sunny" -> "go for a walk"
        mood == "angry" && wather == "cloudy" -> "drink hot chocolate"
        mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
        temperature > 35 -> "go swimming"
        else -> "Stay home and read."
    }
}


main()