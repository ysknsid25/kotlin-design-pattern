package iterator

fun main(args: Array<String>) {
    val bookShelf = BookShelf()
    bookShelf.appendBook(Book("なれる！SE"))
    bookShelf.appendBook(Book("さくら荘のペットな彼女"))
    bookShelf.appendBook(Book("冴えない彼女の育て方"))
    bookShelf.appendBook(Book("やはり俺の青春ラブコメは間違っている"))
    val iterator = bookShelf.iterator()
    while (iterator.hasNext()) {
        val book = iterator.next()
        println(book.name)
    }
}