import iterator.Book
import iterator.BookShelf
import kotlin.collections.Iterator

class BookShelfIterator(private val bookShelf: BookShelf) : Iterator<Book> {
    private var index = 0

    override fun hasNext(): Boolean {
        return index < bookShelf.getLength()
    }

    override fun next(): Book {
        if(!hasNext()){
            throw NoSuchElementException()
        }
        val book = bookShelf.getBookAt(index)
        index++
        return book
    }
}
