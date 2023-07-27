// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class User {
    String name ="Flo";
   String address="Tororo";
   int id=1;

    static void myMethod() {
        System.out.println("Abbo Flo");
    }

    public int myAge(int x){
        return x;

    }

    public static void main(String[] args) {
        User person = new User();
        System.out.println(person.myAge(23));
        myMethod();

    }
}
