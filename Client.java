/*import java.rmi.registry.LocateRegistry; 2nd functioning client
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9100);

            CartInterface cart = (CartInterface) registry.lookup("cart");

            // Prompt user to add products to the cart.
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Enter the names of products you want to add to the cart (separated by commas):");
                String input = scanner.nextLine().trim();

                // Split user input by commas and add products to the cart.
                String[] productNames = input.split(",");
                for (String productName : productNames) {
                    System.out.println("Looking up product: " + productName);
                    Product product = (Product) registry.lookup(productName.trim());
                    if (product != null) {
                        cart.addProduct(product);
                    } else {
                        System.out.println("Product not found: " + productName);
                    }
                }

                // View added products in the cart.
                System.out.println("\nProducts in the Cart:");
                cart.viewAddedProducts();
            }

        } catch (Exception e) {
            System.out.println("Client side error: " + e);
        }
    }
}*/

/*
 * import java.rmi.registry.LocateRegistry;   1st functioning client
 * import java.rmi.registry.Registry;
 * import java.util.Scanner;
 * 
 * public class Client {
 * public static void main(String[] args) {
 * try {
 * Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9100);
 * 
 * CartInterface cart = (CartInterface) registry.lookup("cart");
 * 
 * // Prompt user to add products to the cart.
 * try (Scanner scanner = new Scanner(System.in)) {
 * System.out.
 * println("Enter the names of products you want to add to the cart (separated by commas):"
 * );
 * String input = scanner.nextLine().trim();
 * 
 * // Split user input by commas and add products to the cart.
 * String[] productNames = input.split(",");
 * for (String productName : productNames) {
 * Product product = (Product) registry.lookup(productName.trim());
 * if (product != null) {
 * cart.addProduct(product);
 * } else {
 * System.out.println("Product not found: " + productName);
 * }
 * }
 * 
 * // View added products in the cart.
 * System.out.println("\nProducts in the Cart:");
 * cart.viewAddedProducts();
 * }
 * 
 * } catch (Exception e) {
 * System.out.println("Client side error: " + e);
 * }
 * }
 * }
 */

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9100);

            CartInterface cart = (CartInterface) registry.lookup("cart");

            // Prompt user to add products to the cart.
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Enter the names of products you want to add to the cart (separated by commas):");
                String input = scanner.nextLine().trim();

                // Split user input by commas and add products to the cart.
                String[] productNames = input.split(",");
                for (String productName : productNames) {
                    ProductInterface product = (ProductInterface) registry.lookup(productName.trim());
                    if (product != null) {
                        cart.addProduct(product);
                    } else {
                        System.out.println("Product not found: " + productName);
                    }
                }

                // View added products in the cart.
                System.out.println("\nProducts in the Cart:");
                cart.viewAddedProducts();
            }

        } catch (Exception e) {
            System.out.println("Client side error: " + e);
        }
    }
}
