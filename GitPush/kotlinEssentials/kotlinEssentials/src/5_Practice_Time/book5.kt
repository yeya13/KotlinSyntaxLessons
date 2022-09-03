package `5_Practice_Time`

fun main(){
    val allBooks = setOf ("Cien años de soledad","El amor en los tiempos del cólera", "Del amor y otros demonios")
    val library = mapOf("Gabriel García Márquez" to allBooks)
    val moreBooks =  mutableMapOf<String, String>("Cien años de soledad" to "Gabriel García Márquez")

    println(library.any {it.value.contains("Hamlet")})
    moreBooks.getOrPut("Crónica de una muerte anunciada") { "Gabriel García Márquez" }
    moreBooks.getOrPut("Cien años de soledad") { "Gabriel García Márquez" }
    println(moreBooks)
}