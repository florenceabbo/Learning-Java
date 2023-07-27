import java.util.ArrayList;

import java.util.ArrayList;
public class Books {
    private String name;
    private  String title;
    private int id;
    private ArrayList<String>library;

    public Books(String name, String title, int id){
        this.name = name;
        this.title = title;
        this.id = id;
        this.library = new ArrayList<String>();
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

    public int getId() {
        return id;
    }

    public ArrayList<String> getBooks() {
        return library;
    }

    public void setBooks(ArrayList<String> books) {
        this.library = books;
    }
    public void addBooks(String book){
        library.add(book);
    }
    public void removeBooks(String book){
    library.remove(book);
}
public void bookDetails(){
    System.out.println("id: " + id);
    System.out.println("Name: " + name);
    System.out.println("Title: " + title);
}
public static void main(String [] args){
        Books book1 = new Books("Cooking Guy","Mesh the cook",1);
    Books book2 = new Books("Programing","Mesh the Programer",2);
    Books book3 = new Books("Coding","Mesh the coder",3);
    System.out.println("Library Books");
    book1.bookDetails();
    book2.bookDetails();
    book3.bookDetails();
    System.out.println("Collection");
    book1.addBooks("Buddy");

}
}
