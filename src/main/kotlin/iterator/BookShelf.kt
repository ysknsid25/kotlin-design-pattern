package iterator

import BookShelfIterator
import kotlin.collections.Iterator

class BookShelf : Iterable<Book> {
    private val books = mutableListOf<Book>()

    fun getBookAt(index: Int): Book {
        return books[index]
    }

    fun appendBook(book: Book) {
        books.add(book)
    }

    fun getLength(): Int {
        return books.size
    }

    override fun iterator(): Iterator<Book> {
        return BookShelfIterator(this)
    }
}