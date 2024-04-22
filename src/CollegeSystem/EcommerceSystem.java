package CollegeSystem;

import java.util.Scanner;

public class EcommerceSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the E-Commerce System.");

        System.out.println("Please enter your id:");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.println("Please enter your name: ");
        String name = sc.nextLine();

        System.out.println("Please enter your address: ");
        String address = sc.nextLine();

        Costmer customer = new Costmer(id, name, address);

        System.out.println("How many products you want to add to your cart?");
        int n = sc.nextInt();

        Cart cart = new Cart(customer.getCustomerId(),n);

        for (int i = 0; i < n; i++) {
            System.out.println("Which product would you like to add? 1- Smartphone 2- T-Shirt 3- OOP");
            int choice = sc.nextInt();
/*
            switch (var) {
                case val:
                    
                    break;
                default:
                    throw new AssertionError();
            }
  */          
            
            if (choice == 1) {
                cart.addProduct(new ElectronicProduct(1, "Smartphone", 599.9f, "iphone", 1));
            } else if (choice == 2) {
                cart.addProduct(new ClothingProduct(2, "T-shirt", 19.99f, "XLarge", "Cotton"));
            } else if (choice == 3) {
                cart.addProduct(new BookProduct(3, "OOP", 39.99f, "O'Reilly", "X Publications"));
            }
        }
        float total = (float) cart.calculatePrice();
        System.out.println("Your total is $" + total + ". Would you like to cashout? 1- yes 2- No");
        int decision = sc.nextInt();
        if (decision == 1) {
            Order x = new Order(cart.getCustomerId(), 1, cart.getProducts(),total );
        x.printOrderInfo();
            System.out.println("thank you for using E-Commerce System");
    }
  }
}