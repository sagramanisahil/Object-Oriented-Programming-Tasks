class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }
}

class Store {
    private String name;
    private String location;
    private Product[] productList;
    private int nbProduct;

    public Store(String name, String location) {
        this.name = name;
        this.location = location;
        productList = new Product[100];
        nbProduct = 0;
    }

    public void addProduct(Product product) {
        if (nbProduct < 100) {
            productList[nbProduct] = product;
            nbProduct++;
            System.out.println("Product '" + product.getName() + "' added to store '" + name + "'.");
        } else {
            System.out.println("Cannot add more products. Maximum limit reached.");
        }
    }

    public boolean searchProduct(String productName) {
        for (int i = 0; i < nbProduct; i++) {
            if (productList[i].getName().equals(productName)) {
                return true;
            }
        }
        return false;
    }

    public Product deleteProduct(String productName) {
        for (int i = 0; i < nbProduct; i++) {
            if (productList[i].getName().equals(productName)) {
                Product deletedProduct = productList[i];
                for (int j = i; j < nbProduct - 1; j++) {
                    productList[j] = productList[j + 1];
                }
                nbProduct--;
                System.out.println("Product '" + productName + "' deleted from store '" + name + "'.");
                return deletedProduct;
            }
        }
        System.out.println("Product '" + productName + "' not found in store '" + name + "'.");
        return null;
    }

    public void displayAll() {
        System.out.println("Products available in store '" + name + "':");
        for (int i = 0; i < nbProduct; i++) {
            System.out.println(productList[i].getName());
        }
    }

    public String getName() {
        return name;
    }
}

class Company {
    private String name;
    private Store[] arrayStore;
    private int nbStore;

    public Company(String name) {
        this.name = name;
        arrayStore = new Store[10];
        nbStore = 0;
    }

    public void addStore(Store store) {
        if (nbStore < 10) {
            arrayStore[nbStore] = store;
            nbStore++;
            System.out.println("Store '" + store.getName() + "' added to company '" + name + "'.");
        } else {
            System.out.println("Cannot add more stores. Maximum limit reached.");
        }
    }

    public int searchNbofStore(String productName) {
        int count = 0;
        for (int i = 0; i < nbStore; i++) {
            if (arrayStore[i].searchProduct(productName)) {
                count++;
            }
        }
        return count;
    }

    public void displayAll() {
        System.out.println("Stores belongs to company '" + name + "':");
        for (int i = 0; i < nbStore; i++) {
            System.out.println(arrayStore[i].getName());
        }
    }
}

public class TestCompany {
    public static void main(String[] args) {
        Product p1 = new Product("TV", 4, 34000);
        Product p2 = new Product("Bicycle", 4, 5500);
        Product p3 = new Product("Oven", 3, 70000);

        Store s1 = new Store("Makro", "Karachi");
        Store s2 = new Store("Hypermart", "Karachi");
        s1.addProduct(p1);
        s1.addProduct(p2);
        s1.addProduct(p3);
        s1.displayAll();

        Product tempProduct = s1.deleteProduct("Bicycle");
        if (tempProduct != null)
            System.out.println("Product " + tempProduct.getName() + " is deleted");
        else
            System.out.println("There is no product to delete");

        s1.displayAll();
        s2.addProduct(p1);
        s2.addProduct(p2);
        s2.addProduct(p3);
        s2.displayAll();
        Company c1 = new Company("Unilever");
        c1.addStore(s1);
        c1.addStore(s2);
        c1.displayAll();
        int n = c1.searchNbofStore("TV");
        System.out.println("Number of stores have TV " + n);

    }
}
