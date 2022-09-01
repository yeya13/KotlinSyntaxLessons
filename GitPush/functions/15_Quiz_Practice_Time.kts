fun main() {
    print("What is your mood?")
    println(whatShouldIDoToday(getMood()))
    println(whatShouldIDoToday("angry"))
    println(whatShouldIDoToday("happy", "sunny", 36))
    println(whatShouldIDoToday("studious", "cloudy", 20))
    println(whatShouldIDoToday("happy", "sunny"))

}

fun getMood(): String{
    print("How do you feel?")
    return readLine() ?: "Happy"

}

fun Walk (mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun Swim (temperature: Int) = temperature > 35
fun Sleep (mood: String, weather: String, temperature: Int) = mood == "angry" && weather == "rainy" && temperature == 5
fun Study (mood: String, weather: String, temperature: Int) = mood == "studious" && weather == "cloudy" && temperature == 20

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
    return when {
        Swim(temperature) -> "go swimming"
        Sleep(mood, weather, temperature) -> "stay in bed"
        Walk(mood, weather) -> "go for a walk"
        Study(mood, weather, temperature) -> "study the history of the country"
        else -> "Stay home and read."
    }
}
main()
