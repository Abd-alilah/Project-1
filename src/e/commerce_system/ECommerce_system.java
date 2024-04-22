/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e.commerce_system;

import java.util.Scanner;

/**
 *
 * @author LOL
 */
public class ECommerce_system {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    ElectronicProduct elc;
    elc = new ElectronicProduct(1, "smartphone", 599.9, "Samsung", 1);
    ClothingProduct clo;
    clo = new ClothingProduct(2, "T-shirt", 19.99, "Medium", "Cotton");
    BookProduct book;
    book = new BookProduct(3, "OOP", 39.99, "O’Reilly", "X Publications");
    System.out.println("Welcome to the E-Commerce System!");

    Customer c = new Customer();
    System.out.println("Please enter your id");
    int id = input.nextInt();
    input.nextLine();
    c.setcustomerId(id);
    System.out.println("Please enter your name");
    String name = input.nextLine();
    c.setname(name);
    System.out.println("Enter your address");
    String address = input.nextLine();
    c.setaddress(address);
    System.out.println("How many products you want to add to your cart?");
    int n = input.nextInt();
    Cart cart = new Cart(id, n);
    for (int i = 0; i < n; i++) {
      System.out.print("Which product would you like to add?");
      System.out.print(" 1- smartphone 2- T-shirt 3- OOP");
      System.out.println();
      int choice = input.nextInt();
      switch (choice) {
        case 1:
          cart.addProduct(elc);
          break;
        case 2:
          cart.addProduct(clo);
          break;
        case 3:
          cart.addProduct(book);
          break;
      }
    }
    System.out
        .println("Your total price is $" + cart.calculatePrice() + " would you like to place the order? 1- Yes 2- No");
    int confirm_order = input.nextInt();
    Order order = new Order(id, cart.calculatePrice(), cart.products);
    cart.placeOrder(order, confirm_order);
  }

}
