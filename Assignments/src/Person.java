import java.sql.SQLOutput;
import java.util.random.RandomGenerator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Person {   // created class Person and initialised it attributes of name and age
    String name;
    int age;


    public Person(String name,int age){   // created function to access the person attributes
        this.name = name;
        this.age = age;


    }
    public static void main(String[] args){

        Person person1 = new Person("Florence", 22);  //created Person objects
        Person person2 = new Person("Miff",23);

        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person2.name);
        System.out.println(person2.age);




    }

}