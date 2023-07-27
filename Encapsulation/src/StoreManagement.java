//Write a java program that manages a hardware store. The store must have a name, contact and where it is located.
// The store consists of different products. New products can be added to the store each new day and the store manager
//always updates these products based on the number in stock once a new product has been bought, the manager updates the
// product name  if required and can also delete a product. The manager presents a list of these products to his boss
// with total products in the  store

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    class Product {

        private int productId;
        private String productName;
        private int stock;
        private String price;
        private String image;
        private  LocalDateTime createdAt;
        private LocalDate updatedAt;
        private LocalDate expiryDate;

        public Product(int productId, String productName, int stock, String price, String image, LocalDateTime createdAt, LocalDate updatedAt, LocalDate expiryDate) {
            this.productId = productId;
            this.productName = productName;
            this.stock = stock;
            this.price = price;
            this.image = image;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.expiryDate = expiryDate;
        }


        @Override
        public String toString() {
            return productName + ": " + stock + " in stock";
        }

        public int getProductId() {
            return productId;
        }


        public String getName() {
            return productName;
        }

        public void setName(String name) {
            this.productName = name;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public LocalDateTime getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
        }

        public LocalDate getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(LocalDate updatedAt) {
            this.updatedAt = updatedAt;
        }

        public LocalDate getExpiryDate() {
            return expiryDate;
        }

        public void setExpiryDate(LocalDate expiryDate) {
            this.expiryDate = expiryDate;
        }
        public void ProductDetails() {
            System.out.println("Product_Id:" + productId );
            System.out.println("Name: " + productName);
            System.out.println("Stock: " + stock);
            System.out.println("Price:" + price);
            System.out.println("Image:" + image);
            System.out.println("Created-at:" + createdAt);
            System.out.println("Expiry_Date" + expiryDate);
        }


    }

    class HardwareStore {
        private int storeId;
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

        public static void main(String[] args) {
            Product product1 = new Product(1, "Panga",20,"5000sh","panga",LocalDateTime.now(),LocalDate.now(),Dat("12-06-2024"));
            Product product2 = new Product(2, "cement",50, "40000sh","cement",LocalDateTime.now(),LocalDate.now(),LocalDate.parse("12-04-2024"));
            System.out.println("Product Details:");
            product1.ProductDetails();
        }

    }






