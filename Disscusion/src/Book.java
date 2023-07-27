import java.util.ArrayList;

public class Book {
   private String name;
   private String title;
   private String ISBM;
   private ArrayList<Book>books =new ArrayList<Book>();


    public Book(String name, String title, String ISBM) {
        this.name = name;
        this.title = title;
        this.ISBM = ISBM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBM() {
        return ISBM;
    }

    public void setISBM(String ISBM) {
        this.ISBM = ISBM;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
    public static void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }
    public static void main(String[] args){
        Book book1 =new Book("Abbo","The cooker","326");
        Book book2 =new Book("Abbo1","The cooker1","327");
        Book book3 =new Book("Abbo2","The cooker2","329");
        Book book4 =new Book("Abbo3","The cooker3","325");
        System.out.println("Adding Books");
        Book.addBook(book1);
        Book.addBook(book2);
        Book.addBook(book3);
        Book.addBook(book4);
        ArrayList<Book>books=Book.getBookS();
    }
    }

