import java.util.Scanner;

public class XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept five product information from user and store in an array
        Product[] products = new Product[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter product " + (i+1) + " information:");
            System.out.print("Product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        // Find Pid of the product with the highest price
        int maxPid = findPidOfProductWithHighestPrice(products);
        System.out.println("Product ID with the highest price: " + maxPid);

        // Calculate total amount spent on all products
        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);

        scanner.close();
    }

    // Method to find Pid of the product with the highest price
    public static int findPidOfProductWithHighestPrice(Product[] products) {
        double maxPrice = Double.MIN_VALUE;
        int maxPid = -1;

        for (Product product : products) {
            if (product.getPrice() > maxPrice) {
                maxPrice = product.getPrice();
                maxPid = product.getPid();
            }
        }

        return maxPid;
    }

    // Method to calculate total amount spent on all products
    public static double calculateTotalAmountSpent(Product[] products) {
        double totalAmount = 0;

        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }

        return totalAmount;
    }
}