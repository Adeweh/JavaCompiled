package ShoppingArray;

import java.util.Scanner;

public class ShoppingMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        ShoppingCartItem item;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter customer name: ");;
        String name = userInput.next();
        int press;

        do{
            System.out.println("Enter item name: ");
            String itemName = userInput.next();

            System.out.println("Enter item quantity: ");
            int qty = userInput.nextInt();

            System.out.println("Enter item price: ");
            double price = userInput.nextDouble();

            ShoppingCartItem items = new ShoppingCartItem(itemName,qty,price);
            cart.addItems(items);

            System.out.println("Press 1 to add new item or 0 to end: ");
            press = userInput.nextInt();

        } while (press != 0);

        System.out.println("Enter cashier name");
        String cashierName = userInput.next();

        System.out.println("How much did he give you");
        int amount = userInput.nextInt();



        System.out.println(cart);






    }
}
