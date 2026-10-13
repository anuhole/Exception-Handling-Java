import java.util.Comparator;

public class BooksComparaterByAuthor implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {

        if(o1.getAuthor() == null && o2.getAuthor() == null )
            return 0;
        if(o1.getAuthor() == null)
            return 1;
        if(o2.getAuthor() ==null )
            return -1;
        int authorCompare = o1.getAuthor().compareTo(o2.getAuthor());

        if(authorCompare ==0) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
        return authorCompare;
    }

}
