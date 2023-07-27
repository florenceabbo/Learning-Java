//Write a java program that manages a hardware store. The store must have a name, contact and where it is located.
// The store consists of different products. New products can be added to the store each new day and the store manager
//always updates these products based on the number in stock once a new product has been bought, the manager updates the
// product name  if required and can also delete a product. The manager presents a list of these products to his boss
// with total products in the  store

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return name + ": " + stock + " in stock";
    }
}

class HardwareStore {
    private String name;
    private String contact;
    private String location;
    private List<Product> products;

    public HardwareStore(String name, String contact, String location) {
        this.name = name;
        this.contact = contact;
        this.location = location;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProductStock(String productName, int newStock) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                product.setStock(newStock);
                break;
            }
        }
    }

    public void deleteProduct(String productName) {
        Product productToRemove = null;
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                productToRemove = product;
                break;
            }
        }
        if (productToRemove != null) {
            products.remove(productToRemove);
            System.out.println("Product " + productName + " has been removed.");
        } else {
            System.out.println("Product " + productName + " not found.");
        }
    }

    public void displayProducts() {
        System.out.println("Product list:");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("Total products in store: " + products.size());
    }
}

public class HardwareStoreManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hardware store name: ");
        String storeName = scanner.nextLine();

        System.out.print("Enter store contact: ");
        String storeContact = scanner.nextLine();

        System.out.print("Enter store location: ");
        String storeLocation = scanner.nextLine();

        HardwareStore store = new HardwareStore(storeName, storeContact, storeLocation);

        while (true) {
            System.out.println();
            System.out.println("===== Hardware Store Management Menu =====");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product Stock");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Product List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter product stock: ");
                    int productStock = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    Product newProduct = new Product(productName, productStock);
                    store.addProduct(newProduct);
                    System.out.println("Product added successfully.");
                    break;
                case 2:
                    System.out.print("Enter product name to update stock: ");
                    String productNameToUpdate = scanner.nextLine();
                    System.out.print("Enter new stock quantity: ");
                    int newStockQuantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    store.updateProductStock(productNameToUpdate, newStockQuantity);
                    System.out.println("Stock updated successfully.");
                    break;
                case 3:
                    System.out.print("Enter product name to delete: ");
                    String productToDelete = scanner.nextLine();
                    store.deleteProduct(productToDelete);
                    break;
                case 4:
                    store.displayProducts();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}