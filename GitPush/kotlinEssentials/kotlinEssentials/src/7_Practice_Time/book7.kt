package `7_Practice_Time`

const val MAX_NUMBER_BOOKS = 5

class Book(val title: String, val author: String, val year: Int, val maxBooks: Int = 0) {

    fun canBorrow(): Boolean {
        return maxBooks < MAX_NUMBER_BOOKS
    }

    object Constants {
        const val BASE_URL = "www.books.com/"
    }

    fun printUrl() {
        println(Constants.BASE_URL + "/" + title + "/" + ".html"
        )
    }

    fun getTA(): Pair<String, String>{
        return  (title to author )
    }

    fun getTAY(): Triple<String, String, Int>{
        return Triple (title, author, year)
    }

    companion object BookURL {
        const val BASE_URL = "www.books.com/"
    }
}

fun main() {
    val book = Book("The girls can dream", "Claudia",2020, 3)
    val borrow = book.canBorrow()
    println(borrow)

}
