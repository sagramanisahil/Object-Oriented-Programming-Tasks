import java.util.Scanner;

class Product {
    String name;
    double price;
    boolean available;

    Product(String name, double price, boolean available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
    }
}

public class Example {
    static Product[] products = new Product[3]; // Array to hold products
    static int cartSize = 0;
    
    public static void addToCart(Product product) {
        // Add product to cart
    }

    public static void main(String[] args) {
        // Adding sample products
        products[0] = new Product("Laptop", 999.99, true);
        products[1] = new Product("Smartphone", 599.99, true);
        products[2] = new Product("Headphones", 99.99, false);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name to search: ");
        String searchName = scanner.nextLine();
        Product foundProduct = searchProductByName(searchName);
        if (foundProduct != null) {
            System.out.println("Product found:");
            foundProduct.displayInfo();
            System.out.println("Adding product to cart...");
            addToCart(foundProduct);
            System.out.println("Product added to cart successfully!");
        }
    }

    public static Product searchProductByName(String name) {
        // Search for product by name
        for (Product product : products) {
            if (product != null && product.name.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
}
