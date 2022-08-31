import java.util.Calendar

fun main() {
    println("Hello, world!")
    dayOfWeek()
}

fun dayOfWeek() {
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    println("What day is it today?")

    when(day){
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
    }
}
main()