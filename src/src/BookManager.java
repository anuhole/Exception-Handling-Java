package src;

import java.util.*;

public class BookManager {
    private Set<Book> bookList ;

    public BookManager() {
        this.bookList=new TreeSet<Book>(new BooksComparaterByAuthor());
    }

    public void addBook(Book book) throws BookAlreadyExistsException {
        for(Book b:bookList){
            if(b.getBookName() == book.getBookName()){
                throw new BookAlreadyExistsException("Book is already ");
            }
        }
          bookList.add(book);
    }

    public void deleteBook(int bookId) throws BookNotFoundException {
        boolean found = true;
        Iterator<Book> it = bookList.iterator();
        while (it.hasNext()) {
            if (it.next().getBookId() == bookId) {
                it.remove();
                found = true;
                break;
            } else found = false;

        }

        if (!found) {
            throw new BookNotFoundException("Book with ID " + bookId + " not found for deletion.");
        }

    }

    public Book[] displayAllBooks()  {

        Iterator<Book> it = bookList.iterator();
        return bookList.toArray(new Book[0]);
    }
    public Book getBookWithId(int bookId) throws BookNotFoundException {
        for(Book b:bookList){
            if(b.getBookId() == bookId){
                return b;
            }
        }
        throw new BookNotFoundException("Book is not Exit "+bookId);
    }
    public List<Book> getBooksByAuthor(String author){
        List<Book> books=new ArrayList<>();
        for(Book b:bookList){
            if(b.getAuthor().equalsIgnoreCase(author)){
                books.add(b);
            }
        }
       // System.out.println(books);
        return books;
    }
    public List<Book> sortBooksByAuthor(){
        List<Book> books=new ArrayList<>(bookList);
        books.sort(new BooksComparaterByAuthor());

        return books;
    }

}
