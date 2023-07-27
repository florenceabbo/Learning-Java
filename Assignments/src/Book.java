//Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods
//to add and remove books from a collection.
//Book.java
import java.util.ArrayList; //provides methods to manipulate the size of the array that is used internally to store the List.
//The ArrayList class is a resizable array, which can be found in the java.util package.
// The ArrayList can easily be modified unlike the Array
public class Book {
        private String title;  // Used the private identifier coz we are using the getters and setters methods
        private String author;
        private String ISBN;
        private static final ArrayList < Book   > bookCollection = new ArrayList < Book > (); //Created a new array called bookCollection

        public Book(String title, String author, String ISBN) {  // Created a constructor to initialise attribute of the class
                this.title = title;
                this.author = author;
                this.ISBN = ISBN;
        }

        public String get_Title() {  //Used getter method to get initial values of the attributes from the constructor
                return title;
        }

        public void set_Title(String title) {  //Used setter method to update values of the attribute
                this.title = title;
        }

        public String get_Author() {
                return author;
        }

        public void set_Author(String author) {
                this.author = author;
        }

        public String get_ISBN() {
                return ISBN;
        }

        public void set_ISBN(String ISBN) {
                this.ISBN = ISBN;
        }

        public static void add_Book(Book book) {
                bookCollection.add(book);
        } // function to add book to the array called bookCollection

        public static void remove_Book(Book book) {
                bookCollection.remove(book);
        }   // function to remove book from the array called bookCollection

        public static ArrayList < Book > get_BookCollection() {
                return bookCollection;
        }
        public static void main(String[] args) {
                //Created new instances for books

                Book book1 = new Book("The code lier", "Miff Flo", "12345678");
                Book book2 = new Book("Cooking skills", "Abbo Fulumera", "897654324");
                Book book3= new Book("Lying tips", "Adee Joyce", "897654356");
                Book book4= new Book("Dancing  tips", "Nganda Glays", "897656478");
                Book.add_Book(book1);
                Book.add_Book(book2);
                Book.add_Book(book3);
                Book.add_Book(book4);

                ArrayList < Book > bookCollection = Book.get_BookCollection();
                System.out.println("List of books:");
                for (Book book: bookCollection) {
//                        System.out.println(book1.get_Title());
//                        book1.set_Title("The truth teller");
                        System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
                }
                Book.remove_Book(book1);
                Book.remove_Book(book4);
                System.out.println("\nAfter removing " + book1.get_Title()  +  "and"   +  book4.get_Title() + ":");
                System.out.println("List of books:");
                for (Book book: bookCollection) {
                        System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
                }
        }
}
