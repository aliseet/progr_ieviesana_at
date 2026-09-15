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
                case 1:
                    System.out.println("Enter item name: ");
                    String name = scanner.nextLine();

                    System.out.println("Enter item price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    addItem(name, price);
                    break;
                case 2:
                    System.out.println("Enter item name: ");
                    name = scanner.nextLine();

                    System.out.println("Enter item price: ");
                    price = scanner.nextDouble();

                    System.out.println("Enter item quantity: ");
                    int quantity = scanner.nextInt();

                    addItem(name, price, quantity);
                    break;

            }
        } while (choice != 6);

        static class Item {
            String name;
            double price;
            int quantity;
            double discount;

            Item (String name, double price, int quantity, double discount) {
                this.name = name;
                this.price = price;
                this.quantity = quantity;
                this.discount = discount;
            }

            public double getTotalPrice() {
                return (price * quantity) * (1 - discount/100);
            }
        }

        public static void addItem(String name, double price) {
            Item item = new Item(name, price, 1, 0);
            cart.add(Item);
            System.out.println("\nItem added: " + item.name + ", " + "Quantity: " + item.quantity + ", " + "Discount: " + item.discount + "%\n");
        }

        public static void addItem(String name, double price, int quantity) {
            Item item = new Item(name, price, quantity, 0);
            cart.add(item);
            System.out.println("\n Item added: " + item.name + ", " + "Quantity: " + item.quantity + ", " + "Discount: " + item.discount + "%\n");
        }

        public static void addItem(String name, double price, int quantity, double discount) {
            Item item = new Item(name, price, quantity, discount);
            cart.add(item);
            System.out.println("\n Item added: " + item.name + ", " + "Quantity: " + item.quantity + ", " + "Discount: " + item.discount + "%\n");
        }

        public static void viewCart() {
            if (cart.isEmpty()) {
                System.out.println("No items added to cart.");
            } else {
                System.out.println("\nItems in cart: ");
                for (int = x; x < cart.size(); x++) {
                    Item item = cart.get(x);
                    System.out.println((x + 1) + ". " + "Item added: " + item.name + ", " + "Price: " + item.price + "$, " + "Quantity: " + item.quantity + ", " + "Discount: " + item.discount + "\n");
                }
            }
        }

        public static double calculateTotalPrice() {
            double totalPrice = 0;
            for (Item item : cart) {
                totalPrice += item.getTotalPrice();
            }
            return totalPrice;
        }
    }
}