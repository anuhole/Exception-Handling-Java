import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class TestBookManger {
    //private static BookManager manager;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookManager manger=new BookManager();
        try {
            manger.addBook(new Book(101,"aaaa","vvvv",140,"qqqq"));
            manger.addBook(new Book(102,"hhhh","zzzz",250,"aaaa"));
            manger.addBook(new Book(103,"bbbb","cccc",840,"llll"));
            manger.addBook(new Book(104,"dddd","Anushka",150,"dbikkjfd"));

            for(Book b: manger.displayAllBooks())
            {
                System.out.println(b);
            }



//            System.out.println("after the delete id");
//            for(Book b: manger.displayAllBooks())
//            {
//                System.out.println(b);
//            }

            System.out.println("get Book by ID");
            Book b1=manger.getBookWithId(104);
            System.out.println(b1);
            System.out.println("get Book by Auther");
            List<Book> bookList=manger.getBooksByAuthor("Anushka");
            for(Book b:bookList){
                System.out.println(b);
            }
            System.out.print("\nEnter Book ID to delete: ");
            int deleteId = scanner.nextInt();
            manger.deleteBook(deleteId);



        } catch (BookAlreadyExistsException | BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
