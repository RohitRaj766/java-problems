class Product {
    String name;
    int quantity;

    Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}

class Inventory {
    private Product[] products = new Product[10];
    private int count = 0;

    void addProduct(String name, int quantity) {
        for (int i = 0; i < count; i++) {
            if (products[i].name.equals(name)) {
                products[i].quantity += quantity;
                System.out.println("Added " + quantity + " of " + name + ".");
                return;
            }
        }
        if (count < products.length) {
            products[count++] = new Product(name, quantity);
            System.out.println("Added " + quantity + " of " + name + ".");
        }
    }

    void removeProduct(String name, int quantity) {
        for (int i = 0; i < count; i++) {
            if (products[i].name.equals(name)) {
                products[i].quantity -= quantity;
                if (products[i].quantity <= 0) {
                    products[i] = products[count - 1]; // Replace with last product
                    products[count - 1] = null; // Remove last product
                    count--;
                }
                System.out.println("Removed " + quantity + " of " + name + ".");
                return;
            }
        }
        System.out.println(name + " not found.");
    }

    void checkLowInventory(int threshold) {
        System.out.println("Low Inventory:");
        for (int i = 0; i < count; i++) {
            if (products[i].quantity < threshold) {
                System.out.println(products[i].name + ": " + products[i].quantity);
            }
        }
    }

    void displayInventory() {
        System.out.println("Current Inventory:");
        for (int i = 0; i < count; i++) {
            System.out.println(products[i].name + ": " + products[i].quantity);
        }
    }
}

public class InventoryApp {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addProduct("Apple", 50);
        inventory.addProduct("Banana", 20);
        inventory.addProduct("Orange", 10);
        inventory.displayInventory();
        inventory.removeProduct("Banana", 5);
        inventory.removeProduct("Orange", 15);
        inventory.checkLowInventory(15);
        inventory.displayInventory();
    }
}
