package `3_Practice_Time`

class book(val title: String, val author: String, val year: Int ){

    fun getTA(): Pair<String, String>{
        return  (title to author )
    }

    fun getTAY(): Triple<String, String, Int>{
        return Triple (title, author, year)
    }

}
fun main(){

    val Book = book("The girls can dream", "Claudia",2020)
    val BTA = Book.getTA()
    val BTAY = Book.getTAY()
    println ("Here is your book: '${Book.getTA().first}' written by ${Book.getTA().second} " )
    println ("Here is your book: '${Book.getTAY().first}' written by ${Book.getTAY().second} in ${Book.getTAY().third}")

}