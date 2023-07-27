//Write a Java program to create a class called "Inventory" with a collection of products and methods to
//add and remove products, and to check for low inventory
//Inventory.java
import java.util.ArrayList;

public class Inventory {
    public class Product {
        private String name;
        private int quantity;

        public Product(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
    private ArrayList < Product > products;

    public Inventory() {
        products = new ArrayList < Product > ();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void checkLowInventory() {
        for (Product product: products) {
            if (product.getQuantity() <= 100) {
                System.out.println(product.getName() + " is running low on inventory. Current quantity: " + product.getQuantity());
            }
        }
    }
}
