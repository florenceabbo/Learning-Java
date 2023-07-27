public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public static void main(String[] args){
        Dog dog1 = new Dog("Grace", "Chinees");
        Dog dog2 = new Dog("Vicky", "Japan");
        dog1.setName("Sarah");
        dog1.setBreed("German");
        dog2.setName("Flo");
        dog2.setBreed("Junior");
        System.out.println(dog1.getName() + " From " + dog1.getBreed());
        System.out.println(dog2.getName() + " From " + dog2.getBreed());
//
    }
}
