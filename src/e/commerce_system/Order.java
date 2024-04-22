/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce_system;

/**
 *
 * @author LOL
 */
public class Order {
    private int customerId ;
    private int orderId = 1 ;
    private Product products[] ;
    private double totalPrice ;
    
public Order(){
}

public Order(int customerId, double totalPrice, Product products[]){
    this.customerId = customerId ;
    this.totalPrice = totalPrice ;
    this.products = products ; }

public void printOrderInfo(){
    System.out.println("Here is your order`s summary:");
    System.out.println("Order ID: "+orderId);
    System.out.println("Customer ID: "+customerId);
    System.out.println("Products: ");
    for(int i=0;i<products.length;i++){
        System.out.println(products[i].name+" - "+products[i].price); }
    System.out.println("Total Price: $"+totalPrice); }
    

}
