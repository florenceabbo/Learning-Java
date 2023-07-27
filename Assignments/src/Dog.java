public class Dog {   //Created class Dog
   private String name;  //Assigned attributes using the private identifier which works with the setter methods
   private String breed;

   public Dog(String name,String breed){   //Constructor initialising the attributes
       this.name = name;
       this.breed = breed;
   }

    public String getName() {

       return name;
    }

    public String getBreed() {

       return breed;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setBreed(String breed) {

       this.breed = breed;
    }
    public static void main(String[] args){
       Dog dog1 = new Dog("simba","GermanSheperd");
       Dog dog2 = new Dog("rex","Bulldog");

        System.out.println(dog1.getName());
        dog1.setName("Dexta");
        System.out.println("updated dog name is: " + dog1.getName());







    }
}
