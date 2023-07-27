public class Person {
    private String name;
    private int age;

//    Created constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args){
        /*Creating objects*/
        Person person1 = new Person("Abbo fulumera",22);
        Person person2 = new Person("Victory Dorreen",23);
        System.out.println("Person1: " + person1.getName() +" and is: " + person1.getAge() +" years" );
        System.out.println("Person2: " + person2.getName() +" and is: " + person2.getAge() +" years");
    }
}
