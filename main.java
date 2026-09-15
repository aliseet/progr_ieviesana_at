import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartSystem {
    public static Scanner scanner = new Scanner(System.in);
    static int choice;
    public ArrayList<Item> cart = new ArrayList<>();

    public static void main(String[] args) {
        do {
            System.out.println("Shopping Cart System: ");
            System.out.println("1. Add Item (Name, Price)");
            System.out.println("2. Add Item (Name, Price, Quantity");
            System.out.println("3. Add Item (Name, Price, Quantity, Discount");
            System.out.println("4. View Cart");
            System.out.println("5. Calculate Total");
            System.out.println("6. Exit");
            System.out.println("\nEnter an option; ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                
            }
        } while (choice != 6);
    }
}