package `9_Practice_Time`

import kotlin.random.Random

const val MAX_NUMBER_BOOKS = 5

class Book(val title: String, val author: String, val year: Int, val maxBooks: Int = 0, var pages: Int = 0) {

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

fun Book.weight() : Double {
    return (pages * 1.5)
}

fun Book.tornPages(torn: Int){
    if (pages >= torn){
        pages -= torn
    } else{
        pages = 0
    }
}

class Puppy() {
    fun playWithBook(book: Book) {
        val randPagesToTorn = Random.nextInt(1, book.pages + 1)
        book.tornPages(randPagesToTorn)
    }
}




fun main() {
    val book = Book("The girls can dream", "Claudia",2020, 3, 180)
    val borrow = book.canBorrow()
    println(borrow)
    val puppy = Puppy()
    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("${book.pages}  in ${book.title}")
    }
    println("You can't play anymore on ${book.title}. ")

}